package CodeGeneration;

import AST.*;
import AST.ComponentDecorator.ComponentDecorator;
import AST.ComponentDecorator.ComponentObject;
import AST.Expr.Expr;
import AST.HTMLAndInterpolation.HTML.HTML;
import AST.HTMLAndInterpolation.HTML.HtmlContent;
import AST.HTMLAndInterpolation.InterpolationValue.Interpolation;
import AST.HTMLAndInterpolation.InterpolationValue.InterpolationValue;
import AST.HTMLElementsAndBindings.HTMLElements.HtmlElement;
import AST.Identifier.Identifier;
import AST.Identifier.IdentifierPath;
import AST.Literal.Array.ArrayElement;
import AST.Literal.Array.ArrayList;
import AST.Literal.Array.ArrayLiteral;
import AST.Literal.Object.ObjectBody;
import AST.Literal.Object.ObjectKeyValue;
import AST.Literal.Object.ObjectLiteral;
import AST.Statement.ArrayDeclaration;
import AST.Statement.Statement;
import AST.Styles.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class CodeGenerator {

    private Program currentProgram;
    private String componentSelector;
    private String templateContent;
    private String stylesContent;

    public void emit(Program program) {
        this.currentProgram = program;
        generateSingleFile();
    }

    private void generateSingleFile() {
        // استخراج البيانات الأساسية من الـ AST
        extractBasicInfo();

        // إنشاء محتوى HTML كامل في ملف واحد
        String singleFileContent = generateCompleteHTML();

        // كتابة الملف
        writeSingleFile(singleFileContent);
    }

    private void writeSingleFile(String singleFileContent) {
    }

    private void extractBasicInfo() {
        // استخراج اسم المكون
        componentSelector = currentProgram.getClassName().getName();

        // استخراج الـ template
        ComponentDecorator component = currentProgram.getComponent();
        if (component != null && component.getComponentObject() != null) {
            ComponentObject compObj = component.getComponentObject();
            templateContent = extractTemplate(compObj.getTemplate());

            // استخراج الـ styles
            if (compObj.getStyles() != null) {
                stylesContent = extractStyles(compObj.getStyles());
            }
        }
    }

    private String extractTemplate(HTML html) {
        StringBuilder template = new StringBuilder();
        for (HtmlContent content : html.getContents()) {
            template.append(processHtmlContent(content));
        }
        return template.toString();
    }

    private String extractStyles(Styles styles) {
        StringBuilder css = new StringBuilder();

        for (CssRule rule : styles.getRules()) {
            css.append(rule.getRule()).append(" {\n");
            for (CssDeclaration decl : rule.getDeclarations()) {
                String property = decl.getCss();
                String value = extractPropertyValue(decl.getProperty());
                css.append("  ").append(property).append(": ").append(value).append(";\n");
            }
            css.append("}\n");
        }

        return css.toString();
    }

    private String extractPropertyValue(PropertyValue propertyValue) {
        StringBuilder value = new StringBuilder();

        for (String val : propertyValue.getValues()) {
            value.append(val).append(" ");
        }

        for (CssBasicColor color : propertyValue.getColors()) {
            value.append(color.getColor()).append(" ");
        }

        return value.toString().trim();
    }

    private String processHtmlContent(HtmlContent content) {
        if (content.getHtmlElement() != null) {
            return processHtmlElement(content.getHtmlElement());
        } else if (content.getInterpolationValue() != null) {
            return processInterpolation(content.getInterpolationValue());
        } else if (content.getTextContent() != null) {
            return content.getTextContent();
        }
        return "";
    }

    private String processHtmlElement(HtmlElement element) {
        if (element.getSelfClosingTag() != null) {
            return "<" + element.getSelfClosingTag().getTag() + " />";
        } else {
            return "<" + element.getOpenTag().getHtmlTag().getTag() + ">" +
                    "</" + element.getCloseTag().getHtmlTag().getTag() + ">";
        }
    }

    private String processInterpolation(Interpolation interpolation) {
        InterpolationValue value = interpolation.getValue();
        String expression;

        if (value.getIdentifier() != null) {
            expression = value.getIdentifier().getName();
        } else {
            expression = generateIdentifierPath(value.getIdentifierPath());
        }

        return "{{" + expression + "}}";
    }

    private String generateIdentifierPath(IdentifierPath path) {
        StringBuilder result = new StringBuilder();
        List<Identifier> identifiers = path.getIdentifiers();

        for (int i = 0; i < identifiers.size(); i++) {
            result.append(identifiers.get(i).getName());
            if (i < identifiers.size() - 1) result.append(".");
        }

        return result.toString();
    }

    // ========== التابع الرئيسي لإنشاء ملف HTML كامل ==========
    private String generateCompleteHTML() {
        StringBuilder html = new StringBuilder();

        html.append("<!DOCTYPE html>\n")
                .append("<html lang=\"en\">\n")
                .append("<head>\n")
                .append("    <meta charset=\"UTF-8\">\n")
                .append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n")
                .append("    <title>Angular DSL App</title>\n")
                .append("    <style>\n")
                .append("        /* Global Styles */\n")
                .append("        * { box-sizing: border-box; margin: 0; padding: 0; }\n")
                .append("        body { font-family: Arial, sans-serif; line-height: 1.6; color: #333; }\n")
                .append("        .container { max-width: 1200px; margin: 0 auto; padding: 20px; }\n")
                .append("        \n")
                .append("        /* Component Styles */\n")
                .append(stylesContent != null ? stylesContent : "        /* No styles defined */\n")
                .append("    </style>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("    <div class=\"container\">\n")
                .append("        <h1>Product List</h1>\n")
                .append("        <div id=\"app\">\n")
                .append("            <!-- Products will be rendered here -->\n")
                .append("        </div>\n")
                .append("    </div>\n")
                .append("\n")
                .append("    <script>\n")
                .append("        // بيانات المنتجات\n")
                .append("        const productsData = ").append(generateProductsData()).append(";\n")
                .append("\n")
                .append("        // تطبيق JavaScript\n")
                .append("        function renderProducts() {\n")
                .append("            const appElement = document.getElementById('app');\n")
                .append("            if (!appElement) return;\n")
                .append("\n")
                .append("            let html = '<ul style=\"list-style: none; padding: 0;\">';\n")
                .append("            \n")
                .append("            productsData.forEach(product => {\n")
                .append("                html += `\n")
                .append("                    <li style=\"border: 1px solid #ddd; margin: 10px 0; padding: 15px; border-radius: 5px;\">\n")
                .append("                        <h3 style=\"color: #333;\">${product.name}</h3>\n")
                .append("                        <p style=\"color: #666;\">${product.desc}</p>\n")
                .append("                        <img src=\"${product.image}\" alt=\"${product.name}\" style=\"width: 100px; height: 100px; margin: 10px 0;\">\n")
                .append("                        <br>\n")
                .append("                        <button onclick=\"showDetails('${product.name}')\" style=\"background: #007bff; color: white; border: none; padding: 8px 15px; border-radius: 3px; cursor: pointer;\">\n")
                .append("                            View Details\n")
                .append("                        </button>\n")
                .append("                    </li>\n")
                .append("                `;\n")
                .append("            });\n")
                .append("            \n")
                .append("            html += '</ul>';\n")
                .append("            appElement.innerHTML = html;\n")
                .append("        }\n")
                .append("\n")
                .append("        function showDetails(productName) {\n")
                .append("            const product = productsData.find(p => p.name === productName);\n")
                .append("            if (product) {\n")
                .append("                alert(`Product Details:\\nName: ${product.name}\\nDescription: ${product.desc}\\nImage: ${product.image}`);\n")
                .append("            }\n")
                .append("        }\n")
                .append("\n")
                .append("        // تهيئة التطبيق\n")
                .append("        document.addEventListener('DOMContentLoaded', function() {\n")
                .append("            console.log('Application started with', productsData.length, 'products');\n")
                .append("            renderProducts();\n")
                .append("        });\n")
                .append("    </script>\n")
                .append("</body>\n")
                .append("</html>");

        return html.toString();
    }

    // ========== توليد بيانات المنتجات ==========
    private String generateProductsData() {
        if (currentProgram == null) return "[]";

        StringBuilder productsJson = new StringBuilder();
        productsJson.append("[\n");

        boolean foundProducts = false;

        // البحث عن مصفوفة products
        for (Statement stmt : currentProgram.getStatements()) {
            if (stmt.getArrayDeclaration() != null) {
                ArrayDeclaration arrayDecl = stmt.getArrayDeclaration();
                if (arrayDecl.getIdentifier().getName().equals("products")) {

                    ArrayLiteral arrayLiteral = arrayDecl.getArrayLiteral();
                    if (arrayLiteral != null) {
                        ArrayList arrayList = arrayLiteral.getArray();
                        if (arrayList != null) {
                            List<ArrayElement> elements = arrayList.getElements();

                            for (int i = 0; i < elements.size(); i++) {
                                ArrayElement element = elements.get(i);
                                if (element.getAnyLiteral() != null &&
                                        element.getAnyLiteral().getObjectLiteral() != null) {

                                    ObjectLiteral objLiteral = element.getAnyLiteral().getObjectLiteral();
                                    productsJson.append("    {\n");

                                    ObjectBody objBody = objLiteral.getObject();
                                    List<ObjectKeyValue> keyValues = objBody.getObjects();

                                    for (int j = 0; j < keyValues.size(); j++) {
                                        ObjectKeyValue kv = keyValues.get(j);
                                        String key = kv.getKey().replaceAll("[\"']", "");
                                        String value = extractObjectValue(kv.getValue());

                                        productsJson.append("        \"").append(key).append("\": \"").append(value).append("\"");
                                        if (j < keyValues.size() - 1) productsJson.append(",");
                                        productsJson.append("\n");
                                    }

                                    productsJson.append("    }");
                                    if (i < elements.size() - 1) productsJson.append(",");
                                    productsJson.append("\n");

                                    foundProducts = true;
                                }
                            }
                        }
                    }
                    break;
                }
            }
        }

        productsJson.append("]");

        if (!foundProducts) {
            // بيانات افتراضية للاختبار
            return "[\n" +
                    "    {\n" +
                    "        \"name\": \"Laptop\",\n" +
                    "        \"desc\": \"High performance laptop\",\n" +
                    "        \"image\": \"laptop.png\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"name\": \"Smartphone\",\n" +
                    "        \"desc\": \"Latest model smartphone\", \n" +
                    "        \"image\": \"phone.png\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "        \"name\": \"Tablet\",\n" +
                    "        \"desc\": \"Lightweight and fast tablet\",\n" +
                    "        \"image\": \"tablet.png\"\n" +
                    "    }\n" +
                    "]";
        }

        return productsJson.toString();
    }

    private String extractObjectValue(Expr expr) {
        if (expr == null) return "";

        if (expr.getStringLiteral() != null) {
            return expr.getStringLiteral().replaceAll("[\"']", "");
        } else if (expr.getIdentifier() != null) {
            return expr.getIdentifier().getName();
        }
        return "";
    }

    public void writeToDisk(Path outputDir) throws Exception {
        Files.createDirectories(outputDir);

        // إنشاء ملف HTML واحد
        String singleFileContent = generateCompleteHTML();
        Files.writeString(outputDir.resolve("app.html"), singleFileContent,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

        System.out.println("✅ Single file generated: app.html");
        System.out.println("📁 Location: " + outputDir.toAbsolutePath());
    }

    // دالة مساعدة للحصول على المحتوى المُنشأ (لأغراض الاختبار)
    public String getGeneratedContent() {
        return generateCompleteHTML();
    }
}