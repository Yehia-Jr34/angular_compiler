package ErrorHandling;

import SymbolTable.BaseSymbolTable;
import SymbolTable.Row;
import SymbolTable.SymbolType;
import AST.Identifier.Identifier;

public class SemanticAnalyzer {
    private BaseSymbolTable symbolTable;
    private ErrorReporter errorReporter;
    private String currentScope;

    // قائمة الكلمات المحجوزة من الـ Lexer
    private final String[] reservedWords = {
            // الكلمات المفتاحية
            "import", "from", "export", "class", "constructor", "return",
            "if", "else", "for", "while", "do", "break", "continue",
            "public", "private", "protected", "var", "let", "const",
            "number", "string", "boolean", "any", "console", "log",
            "name", "prod", "ProductsComponent", "products", "selectProduct",

            // Angular specific
            "ngFor", "ngIf", "store", "state", "actions", "reducer",
            "selectors", "select", "selector", "template", "of",
            "dispatch", "on", "styles", "Component",

            // CSS
            "black", "white", "red", "green", "blue", "yellow", "cyan",
            "magenta", "gray", "grey", "silver", "maroon", "purple",
            "fuchsia", "lime", "olive", "navy", "teal", "aqua", "orange",
            "brown", "pink", "violet", "gold", "transparent",

            // CSS خاص - solid
            "solid",

            // القيم المحددة
            "null", "true", "false",

            // الوحدات
            "px", "em", "rem", "%", "vh", "vw", "deg", "rad", "s", "ms",

            // تاغات HTML الشائعة
            "html", "head", "body", "title", "div", "span", "p", "h1", "h2", "h3",
            "h4", "h5", "h6", "a", "img", "ul", "ol", "li", "table", "tr", "td",
            "th", "form", "input", "button", "select", "option", "textarea", "label",
            "style", "script", "link", "meta", "nav", "header", "footer", "section",
            "article", "aside", "main", "figure", "figcaption", "canvas", "svg",
            "path", "circle", "rect", "line", "polygon", "text", "g", "defs",
            "clipPath", "mask", "pattern", "linearGradient", "radialGradient",
            "stop", "animate", "set", "mpath", "use", "symbol", "marker",
            "view", "foreignObject", "desc", "title", "metadata", "switch",
            "br", "hr", "strong", "em", "code", "pre", "blockquote", "cite",
            "q", "abbr", "address", "b", "i", "u", "s", "small", "sub", "sup",
            "time", "data", "var", "samp", "kbd", "mark", "ruby", "rt", "rp",
            "bdi", "bdo", "wbr", "ins", "del", "dl", "dt", "dd", "caption",
            "colgroup", "col", "thead", "tbody", "tfoot", "fieldset", "legend",
            "datalist", "output", "progress", "meter", "details", "summary",
            "menu", "menuitem", "dialog", "slot", "template", "picture",
            "source", "track", "map", "area", "audio", "video", "iframe",
            "object", "param", "embed", "source", "math", "mi", "mo", "mn",
            "ms", "mtext", "mspace", "msqrt", "mroot", "mfrac", "mover",
            "munder", "munderover", "msub", "msup", "msubsup", "mmultiscripts",
            "mtable", "mtr", "mtd", "mlabeledtr", "maction", "menclose",
            "merror", "mfenced", "mphantom", "mpadded", "mstyle", "semantics",
            "annotation", "annotation-xml"
    };

    // قائمة الرموز العالمية في JavaScript
    private final String[] globalSymbols = {
            "localStorage", "JSON", "window", "console", "document",
            "setItem", "stringify", "location", "href", "setTimeout",
            "setInterval", "clearTimeout", "clearInterval", "alert",
            "confirm", "prompt", "parseInt", "parseFloat", "isNaN",
            "isFinite", "encodeURI", "decodeURI", "encodeURIComponent",
            "decodeURIComponent", "eval", "Object", "Array", "String",
            "Number", "Boolean", "Date", "Math", "RegExp", "Function",
            "Error", "TypeError", "RangeError", "ReferenceError",
            "SyntaxError", "URIError", "EvalError", "Promise", "Map",
            "Set", "WeakMap", "WeakSet", "Symbol", "Proxy", "Reflect",
            "Intl", "ArrayBuffer", "DataView", "Float32Array", "Float64Array",
            "Int8Array", "Int16Array", "Int32Array", "Uint8Array",
            "Uint16Array", "Uint32Array", "Uint8ClampedArray"
    };

    public SemanticAnalyzer(BaseSymbolTable symbolTable, ErrorReporter errorReporter) {
        this.symbolTable = symbolTable;
        this.errorReporter = errorReporter;
        this.currentScope = "global";
    }

    public void setCurrentScope(String scope) {
        this.currentScope = scope;
    }

    public String getCurrentScope() {
        return currentScope;
    }

    // التحقق من التعريف المزدوج
    public void checkDuplicateDeclaration(String name, SymbolType symbolType, int line, int column) {
        // تجاهل الرموز المؤقتة والرموز الخاصة والكلمات المحجوزة
        if (isTemporarySymbol(name) || isReservedWord(name) || isGlobalSymbol(name)) {
            return;
        }

        if (symbolTable.existsInCurrentScope(name, currentScope)) {
            errorReporter.reportError(
                    ErrorType.DUPLICATE_VARIABLE,
                    String.format("'%s' is already defined in this scope", name),
                    line, column, currentScope
            );
        }
    }

    // التحقق من وجود متغير
    public boolean checkVariableExists(Identifier identifier) {
        if (identifier == null) return false;

        String variableName = identifier.getName();

        // تجاهل الكلمات المحجوزة
        if (isReservedWord(variableName)) {
            return true;
        }

        // تجاهل الرموز العالمية
        if (isGlobalSymbol(variableName)) {
            return true;
        }

        // تجاهل الرموز المؤقتة
        if (isTemporarySymbol(variableName)) {
            return true;
        }

        Row symbol = symbolTable.lookup(variableName, currentScope);
        if (symbol == null || symbol.getSymbolType() != SymbolType.VARIABLE) {
            errorReporter.reportError(
                    ErrorType.UNDEFINED_VARIABLE,
                    String.format("Variable '%s' is not defined", variableName),
                    0, 0, currentScope
            );
            return false;
        }
        return true;
    }

    // التحقق من وجود دالة
    public boolean checkFunctionExists(String functionName, int line, int column) {
        // تجاهل الكلمات المحجوزة والرموز العالمية
        if (isReservedWord(functionName) || isGlobalSymbol(functionName)) {
            return true;
        }

        Row symbol = symbolTable.lookup(functionName, currentScope);
        if (symbol == null || symbol.getSymbolType() != SymbolType.FUNCTION) {
            errorReporter.reportError(
                    ErrorType.UNDEFINED_FUNCTION,
                    String.format("Function '%s' is not defined", functionName),
                    line, column, currentScope
            );
            return false;
        }
        return true;
    }

    // التحقق من توافق الأنواع
    public void checkTypeCompatibility(String expectedType, String actualType,
                                       int line, int column, String context) {
        if (!areTypesCompatible(expectedType, actualType)) {
            errorReporter.reportError(
                    ErrorType.TYPE_MISMATCH,
                    String.format("In %s: expected '%s' but found '%s'",
                            context, expectedType, actualType),
                    line, column, currentScope
            );
        }
    }

    // التحقق من عدد المعاملات في استدعاء الدالة
    public void checkArgumentCount(String functionName, int expected, int actual, int line, int column) {
        if (expected != actual) {
            errorReporter.reportError(
                    ErrorType.ARGUMENT_COUNT_MISMATCH,
                    String.format("Function '%s' expects %d arguments but got %d",
                            functionName, expected, actual),
                    line, column, currentScope
            );
        }
    }

    // ===== دوال المساعدة =====

    // التحقق إذا كانت الكلمة محجوزة
    private boolean isReservedWord(String word) {
        for (String reserved : reservedWords) {
            if (reserved.equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }

    // التحقق إذا كانت رمزاً عالمياً
    private boolean isGlobalSymbol(String symbol) {
        for (String global : globalSymbols) {
            if (global.equals(symbol)) {
                return true;
            }
        }
        return false;
    }

    // التحقق إذا كانت رمزاً مؤقتاً (مثل [array_literal], [object_literal])
    private boolean isTemporarySymbol(String symbol) {
        return symbol.startsWith("[") && symbol.endsWith("]") ||
                symbol.endsWith("_key") ||
                symbol.endsWith("_property") ||
                symbol.endsWith("_array_element") ||
                symbol.endsWith("_array_ref");
    }

    // قواعد توافق الأنواع
    private boolean areTypesCompatible(String type1, String type2) {
        if (type1.equals("any") || type2.equals("any")) return true;
        if (type1.equals(type2)) return true;

        // قواعد التوافق الأساسية
        return (type1.equals("number") && type2.equals("number")) ||
                (type1.equals("string") && type2.equals("string")) ||
                (type1.equals("boolean") && type2.equals("boolean")) ||
                (type1.equals("array") && type2.equals("array")) ||
                (type1.equals("object") && type2.equals("object"));
    }
}