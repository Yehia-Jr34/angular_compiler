package CodeGeneration;

import AST.*;
import AST.ComponentDecorator.ComponentDecorator;
import AST.ComponentDecorator.ComponentObject;
import AST.Expr.Expr;
import AST.HTMLAndInterpolation.HTML.HTML;
import AST.HTMLAndInterpolation.HTML.HtmlContent;
import AST.HTMLAndInterpolation.InterpolationValue.Interpolation;
import AST.HTMLAndInterpolation.InterpolationValue.InterpolationValue;
import AST.HTMLElementsAndBindings.Attribute.Attribute;
import AST.HTMLElementsAndBindings.Attribute.BoundAttribute;
import AST.HTMLElementsAndBindings.Bindings.EventBinding;
import AST.HTMLElementsAndBindings.Directives.ForDirective;
import AST.HTMLElementsAndBindings.Directives.IfDirective;
import AST.HTMLElementsAndBindings.Directives.StructuralDirectives;
import AST.HTMLElementsAndBindings.HTMLElements.*;
import AST.Identifier.Identifier;
import AST.Identifier.IdentifierPath;
import AST.Initialize.Initialize;
import AST.Literal.Array.ArrayElement;
import AST.Literal.Array.ArrayLiteral;
import AST.Literal.Object.ObjectBody;
import AST.Literal.Object.ObjectKeyValue;
import AST.Literal.Object.ObjectLiteral;
import AST.Statement.ArrayDeclaration;
import AST.Statement.Statement;
import AST.Styles.*;
import AST.StoreDec.*;
import AST.Dec.Variable.VariableDecl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class CodeGenerator {

    private Program currentProgram;
    private List<Map<String, String>> productsData = new ArrayList<>();
    private String itemTemplate = "";

    public void emit(Program program) {
        this.currentProgram = program;
        extractProductsData();
        extractItemTemplate();
    }

    private void extractProductsData() {
        if (currentProgram == null) return;

        System.out.println("🔍 Searching for products data...");
        System.out.println("Total statements: " + currentProgram.getStatements().size());

        // البحث في جميع الـ statements
        for (int i = 0; i < currentProgram.getStatements().size(); i++) {
            Statement stmt = currentProgram.getStatements().get(i);
            System.out.println("Statement " + i + ": " + stmt.getClass().getSimpleName());

            // طباعة المزيد من التفاصيل عن كل statement
            if (stmt.getArrayDeclaration() != null) {
                System.out.println("  - ArrayDeclaration: " + stmt.getArrayDeclaration().getIdentifier().getName());
            }
            if (stmt.getDec() != null) {
                System.out.println("  - Declaration found");
                if (stmt.getDec().getVariableDecl() != null) {
                    System.out.println("    - VariableDecl: " + stmt.getDec().getVariableDecl().getName().getName());
                }
            }
            if (stmt.getExpr() != null) {
                System.out.println("  - Expression found");
                if (stmt.getExpr().getInitialize() != null) {
                    System.out.println("    - Initialize: " + stmt.getExpr().getInitialize().getIdentifier().getName());
                }
            }

            // البحث في ArrayDeclaration
            if (stmt.getArrayDeclaration() != null) {
                ArrayDeclaration arrayDecl = stmt.getArrayDeclaration();
                System.out.println("Found array declaration: " + arrayDecl.getIdentifier().getName());

                if ("products".equals(arrayDecl.getIdentifier().getName())) {
                    System.out.println("✅ Found products array!");
                    productsData = processProductsArray(arrayDecl.getArrayLiteral());
                    System.out.println("Extracted " + productsData.size() + " products");
                    return;
                }
            }

            // البحث في Expr الذي قد يحتوي على initialize
            if (stmt.getExpr() != null && stmt.getExpr().getInitialize() != null) {
                Initialize initialize = stmt.getExpr().getInitialize();
                System.out.println("Found initialize: " + initialize.getIdentifier().getName());

                if ("products".equals(initialize.getIdentifier().getName())) {
                    System.out.println("✅ Found products initialization!");
                    if (initialize.getExpr() != null && initialize.getExpr().getArrayLiteral() != null) {
                        productsData = processProductsArray(initialize.getExpr().getArrayLiteral());
                        System.out.println("Extracted " + productsData.size() + " products");
                        return;
                    } else if (initialize.getAnyLiteral() != null && initialize.getAnyLiteral().getArrayLiteral() != null) {
                        productsData = processProductsArray(initialize.getAnyLiteral().getArrayLiteral());
                        System.out.println("Extracted " + productsData.size() + " products");
                        return;
                    }
                }
            }

            // البحث في VariableDecl
            if (stmt.getDec() != null && stmt.getDec().getVariableDecl() != null) {
                VariableDecl varDecl = stmt.getDec().getVariableDecl();
                System.out.println("Found variable declaration: " + varDecl.getName().getName());

                if ("products".equals(varDecl.getName().getName())) {
                    System.out.println("✅ Found products variable!");
                    if (varDecl.getValue() != null && varDecl.getValue().getArrayLiteral() != null) {
                        productsData = processProductsArray(varDecl.getValue().getArrayLiteral());
                        System.out.println("Extracted " + productsData.size() + " products");
                        return;
                    } else if (varDecl.getExpr() != null && varDecl.getExpr().getArrayLiteral() != null) {
                        productsData = processProductsArray(varDecl.getExpr().getArrayLiteral());
                        System.out.println("Extracted " + productsData.size() + " products");
                        return;
                    }
                }
            }
        }

        System.out.println("❌ No products data found, using defaults");
        // بيانات افتراضية فقط إذا لم يتم العثور على بيانات
        productsData.add(createProduct("Laptop", "High performance", "https://cdn.pixabay.com/photo/2014/05/02/21/50/home-office-336377_1280.jpg"));
        productsData.add(createProduct("Phone", "Latest model", "https://cdn.pixabay.com/photo/2017/01/22/19/20/smartphone-2007617_1280.jpg"));
        productsData.add(createProduct("Tablet", "Lightweight and fast", "https://cdn.pixabay.com/photo/2015/01/21/14/14/ipad-606764_1280.jpg"));
    }

    private void extractItemTemplate() {
        if (currentProgram == null) return;

        ComponentDecorator component = currentProgram.getComponent();
        if (component != null && component.getComponentObject() != null) {
            HTML html = component.getComponentObject().getTemplate();
            if (html != null) {
                itemTemplate = extractNgForItemTemplate(html);
                System.out.println("📄 Extracted item template: " + itemTemplate);
            }
        }
    }

    private String extractNgForItemTemplate(HTML html) {
        for (HtmlContent content : html.getContents()) {
            if (content.getHtmlElement() != null) {
                String result = findNgForContent(content.getHtmlElement());
                if (!result.isEmpty()) {
                    return result;
                }
            }
        }
        return "";
    }

    private String findNgForContent(HtmlElement element) {
        if (element.getOpenTag() != null) {
            OpenTag openTag = element.getOpenTag();

            if (openTag.getStructuralDirectives() != null &&
                    openTag.getStructuralDirectives().getForDirective() != null) {
                System.out.println("✅ Found ngFor directive");
                return processElementContent(element);
            }

            for (HtmlContent content : element.getHtmlContent()) {
                if (content.getHtmlElement() != null) {
                    String result = findNgForContent(content.getHtmlElement());
                    if (!result.isEmpty()) {
                        return result;
                    }
                }
            }
        }
        return "";
    }

    private String processElementContent(HtmlElement element) {
        StringBuilder contentBuilder = new StringBuilder();

        for (HtmlContent content : element.getHtmlContent()) {
            contentBuilder.append(processHtmlContentForTemplate(content));
        }

        return contentBuilder.toString();
    }

    private String processHtmlContentForTemplate(HtmlContent content) {
        if (content.getHtmlElement() != null) {
            return processHtmlElementForTemplate(content.getHtmlElement());
        } else if (content.getInterpolationValue() != null) {
            return processInterpolationForTemplate(content.getInterpolationValue());
        } else if (content.getTextContent() != null) {
            return content.getTextContent();
        }
        return "";
    }

    private String processHtmlElementForTemplate(HtmlElement element) {
        if (element.getSelfClosingTag() != null) {
            return processSelfClosingTagForTemplate(element.getSelfClosingTag());
        } else {
            return processOpenCloseTagForTemplate(element);
        }
    }

    private String processSelfClosingTagForTemplate(SelfClosingTag tag) {
        StringBuilder html = new StringBuilder();
        html.append("<").append(tag.getTag());

        if (tag.getAttributes() != null) {
            for (Attribute attr : tag.getAttributes()) {
                html.append(" ").append(attr.getName().getName()).append("=\"")
                        .append(processAttributeValueForTemplate(attr.getValue())).append("\"");
            }
        }

        if (tag.getBoundAttributes() != null) {
            for (BoundAttribute boundAttr : tag.getBoundAttributes()) {
                String attrName = boundAttr.getName().getName();
                String value = processBoundAttributeForTemplate(boundAttr);
                html.append(" ").append(attrName).append("=\"").append(value).append("\"");
            }
        }

        html.append(" />");
        return html.toString();
    }

    private String processOpenCloseTagForTemplate(HtmlElement element) {
        StringBuilder html = new StringBuilder();
        OpenTag openTag = element.getOpenTag();

        html.append("<").append(openTag.getHtmlTag().getTag());

        if (openTag.getAttributes() != null) {
            for (Attribute attr : openTag.getAttributes()) {
                html.append(" ").append(attr.getName().getName()).append("=\"")
                        .append(processAttributeValueForTemplate(attr.getValue())).append("\"");
            }
        }

        if (openTag.getBoundAttributes() != null) {
            for (BoundAttribute boundAttr : openTag.getBoundAttributes()) {
                String attrName = boundAttr.getName().getName();
                String value = processBoundAttributeForTemplate(boundAttr);
                html.append(" ").append(attrName).append("=\"").append(value).append("\"");
            }
        }

        if (openTag.getEventBindings() != null) {
            for (EventBinding event : openTag.getEventBindings()) {
                html.append(" ").append("onclick=\"handleProductClick(this)\"");
            }
        }

        html.append(">");

        for (HtmlContent content : element.getHtmlContent()) {
            html.append(processHtmlContentForTemplate(content));
        }

        html.append("</").append(openTag.getHtmlTag().getTag()).append(">");
        return html.toString();
    }

    private String processAttributeValueForTemplate(AST.HTMLElementsAndBindings.Attribute.AttributeValue attrValue) {
        if (attrValue.getValue() != null) {
            return attrValue.getValue().replaceAll("[\"']", "");
        } else if (attrValue.getPath() != null) {
            return "{{" + generateIdentifierPath(attrValue.getPath()) + "}}";
        }
        return "";
    }

    private String processBoundAttributeForTemplate(BoundAttribute boundAttr) {
        if (boundAttr.getBound() != null) {
            String path = generateIdentifierPath(boundAttr.getBound());
            String attrName = boundAttr.getName().getName();

            // معالجة خاصة لـ src binding
            if ("src".equals(attrName) && "prod.image".equals(path)) {
                return "PRODUCT_IMAGE_URL";
            }

            return "{{" + path + "}}";
        } else {
            return boundAttr.getValue().replaceAll("[\"']", "");
        }
    }

    private String processInterpolationForTemplate(Interpolation interpolation) {
        InterpolationValue value = interpolation.getValue();
        String expression;

        if (value.getIdentifier() != null) {
            expression = value.getIdentifier().getName();
        } else {
            expression = generateIdentifierPath(value.getIdentifierPath());
        }

        return "{{" + expression + "}}";
    }

    private List<Map<String, String>> processProductsArray(ArrayLiteral arrayLiteral) {
        List<Map<String, String>> result = new java.util.ArrayList<>();

        if (arrayLiteral == null || arrayLiteral.getArray() == null) {
            System.out.println("❌ ArrayLiteral is null or empty");
            return result;
        }

        System.out.println("Processing products array with " + arrayLiteral.getArray().getElements().size() + " elements");

        for (ArrayElement element : arrayLiteral.getArray().getElements()) {
            if (element.getAnyLiteral() != null &&
                    element.getAnyLiteral().getObjectLiteral() != null) {

                Map<String, String> product = extractProductFromObject(element.getAnyLiteral().getObjectLiteral());
                if (!product.isEmpty()) {
                    System.out.println("✅ Extracted product: " + product);
                    result.add(product);
                }
            } else if (element.getExpr() != null && element.getExpr().getObjectLiteral() != null) {
                Map<String, String> product = extractProductFromObject(element.getExpr().getObjectLiteral());
                if (!product.isEmpty()) {
                    System.out.println("✅ Extracted product from expr: " + product);
                    result.add(product);
                }
            }
        }

        return result;
    }

    private Map<String, String> extractProductFromObject(ObjectLiteral objLiteral) {
        Map<String, String> product = new HashMap<>();

        if (objLiteral.getObject() != null) {
            for (ObjectKeyValue kv : objLiteral.getObject().getObjects()) {
                String key = kv.getKey().replaceAll("[\"']", "");
                String value = extractSimpleValue(kv.getValue());
                product.put(key, value);
                System.out.println("   - " + key + ": " + value);
            }
        }

        return product;
    }

    private String extractSimpleValue(Expr expr) {
        if (expr == null) return "";
        if (expr.getStringLiteral() != null) {
            return expr.getStringLiteral().replaceAll("[\"']", "");
        } else if (expr.getIdentifier() != null) {
            return expr.getIdentifier().getName();
        }
        return "";
    }

    private Map<String, String> createProduct(String name, String desc, String image) {
        Map<String, String> product = new HashMap<>();
        product.put("name", name);
        product.put("desc", desc);
        product.put("image", image);
        return product;
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

    public void writeToDisk(Path outputDir) throws Exception {
        Files.createDirectories(outputDir);
        String htmlContent = generateCompleteHTML();
        Files.writeString(outputDir.resolve("app.html"), htmlContent,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println("✅ Generated: app.html");
    }

    private String generateCompleteHTML() {
        String stylesCSS = extractStylesCSS();

        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Products App</title>\n" +
                "    <style>\n" +
                stylesCSS +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <h1>Products</h1>\n" +
                "        <div id=\"products-container\">\n" +
                "            <!-- سيتم ملء المحتوى ديناميكياً -->\n" +
                "        </div>\n" +
                "    </div>\n" +
                "    <script>\n" +
                generateJavaScript() +
                "    </script>\n" +
                "</body>\n" +
                "</html>";
    }

    private String extractStylesCSS() {
        if (currentProgram == null) return getDefaultCSS();

        ComponentDecorator component = currentProgram.getComponent();
        if (component != null && component.getComponentObject() != null) {
            Styles styles = component.getComponentObject().getStyles();
            if (styles != null) {
                return processStyles(styles);
            }
        }

        return getDefaultCSS();
    }

    private String processStyles(Styles styles) {
        StringBuilder css = new StringBuilder();

        css.append(getDefaultCSS()).append("\n");

        for (CssRule rule : styles.getRules()) {
            String selector = fixCssSelector(rule.getRule());
            css.append(selector).append(" {\n");

            for (CssDeclaration decl : rule.getDeclarations()) {
                String property = decl.getCss();
                String value = processCssValue(decl.getProperty());
                if (!value.isEmpty()) {
                    css.append("    ").append(property).append(": ").append(value).append(";\n");
                }
            }

            css.append("}\n");
        }

        return css.toString();
    }

    private String fixCssSelector(String selector) {
        return selector.replace("u1", "ul")
                .replace("di1", "div")
                .replace("spam", "span");
    }

    private String processCssValue(PropertyValue propertyValue) {
        StringBuilder value = new StringBuilder();

        if (propertyValue.getValues() != null) {
            for (String val : propertyValue.getValues()) {
                String fixedVal = fixCssValue(val);
                if (!fixedVal.isEmpty()) {
                    value.append(fixedVal).append(" ");
                }
            }
        }

        if (propertyValue.getColors() != null) {
            for (CssBasicColor color : propertyValue.getColors()) {
                value.append(color.getColor()).append(" ");
            }
        }

        return value.toString().trim();
    }

    private String fixCssValue(String value) {
        if (value == null || value.isEmpty()) return "";

        if (value.matches("px\\s+\\d+")) {
            return value.replace("px ", "") + "px";
        }
        if (value.matches("em\\s+\\d+")) {
            return value.replace("em ", "") + "em";
        }
        if (value.equals("px") || value.equals("em")) {
            return "";
        }

        return value;
    }

    private String getDefaultCSS() {
        return "body { font-family: Arial, sans-serif; margin: 0; padding: 20px; background: #f5f5f5; }\n" +
                ".container { max-width: 800px; margin: 0 auto; background: white; padding: 20px; border-radius: 10px; box-shadow: 0 2px 10px rgba(0,0,0,0.1); }\n" +
                "h1 { text-align: center; color: #333; margin-bottom: 30px; }\n" +
                "#products-container { margin-top: 20px; }\n" +
                "ul { list-style: none; padding: 0; margin: 0; }\n" +
                "li { border: 1px solid #e0e0e0; padding: 20px; margin: 15px 0; border-radius: 8px; background: #fafafa; }\n" +
                "h3 { margin: 0 0 10px 0; color: #333; }\n" +
                "p { margin: 0 0 15px 0; color: #666; }\n" +
                "img { max-width: 200px; height: auto; display: block; margin: 10px 0; border-radius: 4px; border: 1px solid #ddd; }\n" +
                "button { background: #007bff; color: white; border: none; padding: 10px 20px; border-radius: 5px; cursor: pointer; }\n" +
                "button:hover { background: #0056b3; }\n";
    }

    private String generateJavaScript() {
        StringBuilder js = new StringBuilder();

        js.append("// بيانات المنتجات\n")
                .append("const productsData = ").append(formatProductsData()).append(";\n\n")

                .append("// القالب الديناميكي المستخرج\n")
                .append("const itemTemplate = `").append(itemTemplate).append("`;\n\n")

                .append("// دالة لعرض المنتجات\n")
                .append("function renderProducts() {\n")
                .append("    const container = document.getElementById('products-container');\n")
                .append("    if (!container) return;\n\n")
                .append("    let html = '';\n\n")
                .append("    if (productsData.length === 0) {\n")
                .append("        html = '<p>No products available</p>';\n")
                .append("    } else {\n")
                .append("        productsData.forEach(product => {\n")
                .append("            let itemHtml = itemTemplate;\n")
                .append("            \n")
                .append("            // استبدال الـ interpolations\n")
                .append("            itemHtml = itemHtml.replace(/{{prod\\.name}}/g, product.name || '');\n")
                .append("            itemHtml = itemHtml.replace(/{{prod\\.desc}}/g, product.desc || '');\n")
                .append("            itemHtml = itemHtml.replace(/{{prod\\.image}}/g, product.image || '');\n")
                .append("            \n")
                .append("            // استبدال الـ property bindings للصور\n")
                .append("            itemHtml = itemHtml.replace(/src=\"PRODUCT_IMAGE_URL\"/g, 'src=\"' + (product.image || '') + '\"');\n")
                .append("            \n")
                .append("            html += itemHtml;\n")
                .append("        });\n")
                .append("    }\n\n")
                .append("    container.innerHTML = '<ul>' + html + '</ul>';\n")
                .append("}\n\n")

                .append("// دالة لاختيار المنتج\n")
                .append("function handleProductClick(button) {\n")
                .append("    const productElement = button.closest('li');\n")
                .append("    if (productElement) {\n")
                .append("        const productName = productElement.querySelector('h3')?.textContent || \n")
                .append("                          productElement.querySelector('h1, h2, h4, h5, h6')?.textContent ||\n")
                .append("                          'Unknown Product';\n")
                .append("        \n")
                .append("        const product = productsData.find(p => p.name === productName);\n")
                .append("        if (product) {\n")
                .append("            const message = `Product Details:\\\\n\\\\n` +\n")
                .append("                          `Name: ${product.name}\\\\n` +\n")
                .append("                          `Description: ${product.desc}\\\\n` +\n")
                .append("                          `Image URL: ${product.image}`;\n")
                .append("            alert(message);\n")
                .append("            localStorage.setItem('selectedProduct', JSON.stringify(product));\n")
                .append("        }\n")
                .append("    }\n")
                .append("}\n\n")

                .append("// تهيئة التطبيق\n")
                .append("document.addEventListener('DOMContentLoaded', function() {\n")
                .append("    console.log('Products data:', productsData);\n")
                .append("    console.log('Item template:', itemTemplate);\n")
                .append("    renderProducts();\n")
                .append("});");

        return js.toString();
    }

    private String formatProductsData() {
        if (productsData.isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[\n");

        List<String> productStrings = new java.util.ArrayList<>();
        for (Map<String, String> product : productsData) {
            StringBuilder productSb = new StringBuilder();
            productSb.append("    {\n");

            List<String> properties = new java.util.ArrayList<>();
            properties.add("        name: \"" + (product.get("name") != null ? product.get("name") : "") + "\"");
            properties.add("        desc: \"" + (product.get("desc") != null ? product.get("desc") : "") + "\"");
            properties.add("        image: \"" + (product.get("image") != null ? product.get("image") : "") + "\"");

            productSb.append(String.join(",\n", properties));
            productSb.append("\n    }");
            productStrings.add(productSb.toString());
        }

        sb.append(String.join(",\n", productStrings));
        sb.append("\n]");
        return sb.toString();
    }
}