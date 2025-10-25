package CodeGeneration;

import AST.*;
import AST.ComponentDecorator.ComponentDecorator;
import AST.HTMLAndInterpolation.HTML.HTML;
import AST.HTMLAndInterpolation.HTML.HtmlContent;
import AST.HTMLAndInterpolation.InterpolationValue.Interpolation;
import AST.HTMLAndInterpolation.InterpolationValue.InterpolationValue;
import AST.HTMLElementsAndBindings.Attribute.Attribute;
import AST.HTMLElementsAndBindings.Attribute.BoundAttribute;
import AST.HTMLElementsAndBindings.Bindings.EventBinding;
import AST.HTMLElementsAndBindings.HTMLElements.*;
import AST.Identifier.Identifier;
import AST.Identifier.IdentifierPath;
import AST.Initialize.Initialize;
import AST.Literal.Object.ObjectKeyValue;
import AST.Literal.Object.ObjectLiteral;
import AST.Statement.Statement;
import AST.Styles.*;
import AST.Dec.Variable.VariableDecl;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class AddProductCodeGenerator {

    private Program currentProgram;
    private String formTemplate = "";
    private String stylesCSS = "";
    private Map<String, String> formFields = new HashMap<>();
    private Map<String, String> fieldLabels = new HashMap<>();
    private List<HtmlElement> allInputs = new ArrayList<>();
    private String pageTitle = "إضافة منتج جديد";
    private String titleTag = "h2"; // نوع العنوان الافتراضي

    public void emit(Program program) {
        this.currentProgram = program;
        extractFormTemplate();
        extractStyles();
        extractFormFields();
        extractFieldLabelsAndTitle();

        System.out.println("✅ Form fields extracted: " + formFields);
        System.out.println("✅ Field labels extracted: " + fieldLabels);
        System.out.println("✅ Page title: " + pageTitle);
        System.out.println("✅ Title tag: " + titleTag);
        System.out.println("✅ Template extracted: " + formTemplate.length() + " characters");
    }

    private void extractFormTemplate() {
        if (currentProgram == null) return;

        System.out.println("🔍 Searching for form template...");

        ComponentDecorator component = currentProgram.getComponent();
        if (component != null && component.getComponentObject() != null) {
            HTML html = component.getComponentObject().getTemplate();
            if (html != null) {
                formTemplate = processFormTemplate(html);
                System.out.println("✅ Extracted form template");
            }
        }
    }

    private String processFormTemplate(HTML html) {
        StringBuilder templateBuilder = new StringBuilder();

        for (HtmlContent content : html.getContents()) {
            templateBuilder.append(processHtmlContent(content));
        }

        return templateBuilder.toString();
    }

    private String processHtmlContent(HtmlContent content) {
        if (content.getHtmlElement() != null) {
            return processHtmlElement(content.getHtmlElement());
        } else if (content.getTextContent() != null) {
            return content.getTextContent().trim();
        } else if (content.getInterpolationValue() != null) {
            return processInterpolation(content.getInterpolationValue());
        }
        return "";
    }

    private String processHtmlElement(HtmlElement element) {
        if (element == null) return "";

        if (element.getSelfClosingTag() != null) {
            return processSelfClosingTag(element.getSelfClosingTag());
        } else if (element.getOpenTag() != null) {
            return processOpenCloseTag(element);
        }
        return "";
    }

    private String processSelfClosingTag(SelfClosingTag tag) {
        if (tag == null) return "";

        StringBuilder html = new StringBuilder();
        html.append("<").append(tag.getTag());

        if (tag.getAttributes() != null) {
            for (Attribute attr : tag.getAttributes()) {
                html.append(" ").append(attr.getName().getName()).append("=\"")
                        .append(processAttributeValue(attr.getValue())).append("\"");
            }
        }

        if (tag.getBoundAttributes() != null) {
            for (BoundAttribute boundAttr : tag.getBoundAttributes()) {
                processBoundAttributeForForm(boundAttr, html);
            }
        }

        html.append(">");
        return html.toString();
    }

    private String processOpenCloseTag(HtmlElement element) {
        if (element == null || element.getOpenTag() == null) return "";

        StringBuilder html = new StringBuilder();
        OpenTag openTag = element.getOpenTag();

        html.append("<").append(openTag.getHtmlTag().getTag());

        if (openTag.getAttributes() != null) {
            for (Attribute attr : openTag.getAttributes()) {
                html.append(" ").append(attr.getName().getName()).append("=\"")
                        .append(processAttributeValue(attr.getValue())).append("\"");
            }
        }

        if (openTag.getBoundAttributes() != null) {
            for (BoundAttribute boundAttr : openTag.getBoundAttributes()) {
                processBoundAttributeForForm(boundAttr, html);
            }
        }

        if (openTag.getEventBindings() != null) {
            for (EventBinding event : openTag.getEventBindings()) {
                if ("click".equals(event.getEventName().getEventName())) {
                    html.append(" onclick=\"addProduct()\"");
                }
            }
        }

        html.append(">");

        if (element.getHtmlContent() != null) {
            for (HtmlContent content : element.getHtmlContent()) {
                html.append(processHtmlContent(content));
            }
        }

        html.append("</").append(openTag.getHtmlTag().getTag()).append(">");
        return html.toString();
    }

    private void processBoundAttributeForForm(BoundAttribute boundAttr, StringBuilder html) {
        if (boundAttr == null) return;

        String attrName = boundAttr.getName().getName();

        if ("ngModel".equals(attrName)) {
            String fieldName = extractFieldNameFromNgModel(boundAttr);
            if (!fieldName.isEmpty()) {
                html.append(" id=\"").append(fieldName).append("\"");
                html.append(" name=\"").append(fieldName).append("\"");
                formFields.put(fieldName, getFieldLabel(fieldName));
            }
        } else {
            String value = processBoundAttributeValue(boundAttr);
            html.append(" ").append(attrName).append("=\"").append(value).append("\"");
        }
    }

    private String extractFieldNameFromNgModel(BoundAttribute boundAttr) {
        if (boundAttr.getBound() != null) {
            String path = generateIdentifierPath(boundAttr.getBound());
            System.out.println("🔍 Found ngModel path: " + path);
            if (path.contains(".")) {
                return path.substring(path.lastIndexOf('.') + 1);
            }
            return path;
        }
        return "";
    }

    private String processBoundAttributeValue(BoundAttribute boundAttr) {
        if (boundAttr.getBound() != null) {
            return "{{" + generateIdentifierPath(boundAttr.getBound()) + "}}";
        } else if (boundAttr.getValue() != null) {
            return boundAttr.getValue().replaceAll("[\"']", "");
        }
        return "";
    }

    private String getFieldLabel(String fieldName) {
        return fieldLabels.getOrDefault(fieldName, getDefaultFieldLabel(fieldName));
    }

    private String getDefaultFieldLabel(String fieldName) {
        switch (fieldName) {
            case "name": return "اسم المنتج";
            case "desc": return "الوصف";
            case "image": return "رابط الصورة";
            default: return fieldName;
        }
    }

    private void extractFieldLabelsAndTitle() {
        if (currentProgram == null) return;

        System.out.println("🔍 Extracting field labels and title from template...");

        ComponentDecorator component = currentProgram.getComponent();
        if (component != null && component.getComponentObject() != null) {
            HTML html = component.getComponentObject().getTemplate();
            if (html != null) {
                extractLabelsAndTitleFromHTML(html);
            }
        }
    }

    private void extractLabelsAndTitleFromHTML(HTML html) {
        if (html == null || html.getContents() == null) return;

        for (HtmlContent content : html.getContents()) {
            collectInputElements(content);
        }

        for (HtmlContent content : html.getContents()) {
            extractLabelsAndTitleFromHtmlContent(content);
        }
    }

    private void collectInputElements(HtmlContent content) {
        if (content == null) return;

        if (content.getHtmlElement() != null) {
            collectInputsFromElement(content.getHtmlElement());
        }
    }

    private void collectInputsFromElement(HtmlElement element) {
        if (element == null) return;

        if (isInputElement(element)) {
            allInputs.add(element);
        }

        if (element.getHtmlContent() != null) {
            for (HtmlContent content : element.getHtmlContent()) {
                collectInputElements(content);
            }
        }
    }

    private void extractLabelsAndTitleFromHtmlContent(HtmlContent content) {
        if (content == null) return;

        if (content.getHtmlElement() != null) {
            extractLabelsAndTitleFromHtmlElement(content.getHtmlElement());
        }
    }

    private void extractLabelsAndTitleFromHtmlElement(HtmlElement element) {
        if (element == null) return;

        // استخراج العنوان ونوعه
        if (element.getOpenTag() != null &&
                element.getOpenTag().getHtmlTag().getTag().matches("h[1-6]")) {
            String titleText = extractTextFromElement(element);
            if (!titleText.isEmpty()) {
                pageTitle = titleText.trim();
                titleTag = element.getOpenTag().getHtmlTag().getTag(); // حفظ نوع العنوان
                System.out.println("✅ Found page title: '" + pageTitle + "' with tag: '" + titleTag + "'");
            }
        }

        // استخراج الـ labels
        if (element.getOpenTag() != null && "label".equalsIgnoreCase(element.getOpenTag().getHtmlTag().getTag())) {
            String labelText = extractTextFromElement(element);
            if (!labelText.isEmpty()) {
                String fieldName = findInputFieldInSameContainer(element);
                if (!fieldName.isEmpty()) {
                    fieldLabels.put(fieldName, labelText.replace(":", "").trim());
                    System.out.println("✅ Found label: '" + labelText + "' for field: '" + fieldName + "'");
                } else {
                    System.out.println("❌ Could not find associated field for label: '" + labelText + "'");
                }
            }
        }

        if (element.getHtmlContent() != null) {
            for (HtmlContent content : element.getHtmlContent()) {
                extractLabelsAndTitleFromHtmlElement(content.getHtmlElement());
            }
        }
    }

    private String findInputFieldInSameContainer(HtmlElement labelElement) {
        if (labelElement == null) return "";

        // ابحث في العناصر المجاورة في نفس المستوى
        HtmlElement container = findContainerElement(labelElement);
        if (container != null && container.getHtmlContent() != null) {
            boolean foundLabel = false;

            for (HtmlContent content : container.getHtmlContent()) {
                if (content.getHtmlElement() != null) {
                    HtmlElement currentElement = content.getHtmlElement();

                    if (currentElement == labelElement) {
                        foundLabel = true;
                        continue;
                    }

                    if (foundLabel && isInputElement(currentElement)) {
                        String fieldName = extractFieldNameFromInput(currentElement);
                        if (!fieldName.isEmpty()) {
                            return fieldName;
                        }
                    }
                }
            }
        }

        return "";
    }

    private HtmlElement findContainerElement(HtmlElement element) {
        // محاولة العثور على العنصر الحاوي (div أو أي container)
        // هذه محاكاة بسيطة - في الواقع تحتاج لتتبع الـ parent
        return null;
    }

    private String extractTextFromElement(HtmlElement element) {
        if (element == null || element.getHtmlContent() == null) return "";

        StringBuilder text = new StringBuilder();
        for (HtmlContent content : element.getHtmlContent()) {
            if (content.getTextContent() != null) {
                text.append(content.getTextContent().trim()).append(" ");
            } else if (content.getHtmlElement() != null) {
                text.append(extractTextFromElement(content.getHtmlElement()));
            }
        }
        return text.toString().trim();
    }

    private boolean isInputElement(HtmlElement element) {
        if (element == null || element.getOpenTag() == null) return false;

        String tagName = element.getOpenTag().getHtmlTag().getTag();
        return "input".equalsIgnoreCase(tagName) ||
                "textarea".equalsIgnoreCase(tagName) ||
                "select".equalsIgnoreCase(tagName);
    }

    private String extractFieldNameFromInput(HtmlElement inputElement) {
        if (inputElement == null || inputElement.getOpenTag() == null) return "";

        if (inputElement.getOpenTag().getBoundAttributes() != null) {
            for (BoundAttribute boundAttr : inputElement.getOpenTag().getBoundAttributes()) {
                if ("ngModel".equals(boundAttr.getName().getName())) {
                    return extractFieldNameFromNgModel(boundAttr);
                }
            }
        }

        if (inputElement.getOpenTag().getAttributes() != null) {
            for (Attribute attr : inputElement.getOpenTag().getAttributes()) {
                if ("name".equals(attr.getName().getName()) && attr.getValue() != null) {
                    return attr.getValue().getValue().replaceAll("[\"']", "");
                }
            }
        }

        return "";
    }

    private String processAttributeValue(AST.HTMLElementsAndBindings.Attribute.AttributeValue attrValue) {
        if (attrValue == null) return "";

        if (attrValue.getValue() != null) {
            return attrValue.getValue().replaceAll("[\"']", "");
        } else if (attrValue.getPath() != null) {
            return "{{" + generateIdentifierPath(attrValue.getPath()) + "}}";
        }
        return "";
    }

    private String processInterpolation(Interpolation interpolation) {
        if (interpolation == null || interpolation.getValue() == null) return "";

        InterpolationValue value = interpolation.getValue();
        String expression;

        if (value.getIdentifier() != null) {
            expression = value.getIdentifier().getName();
        } else if (value.getIdentifierPath() != null) {
            expression = generateIdentifierPath(value.getIdentifierPath());
        } else {
            expression = "";
        }

        return "{{" + expression + "}}";
    }

    private String generateIdentifierPath(IdentifierPath path) {
        if (path == null || path.getIdentifiers() == null) return "";

        StringBuilder result = new StringBuilder();
        List<Identifier> identifiers = path.getIdentifiers();

        for (int i = 0; i < identifiers.size(); i++) {
            if (identifiers.get(i) != null) {
                result.append(identifiers.get(i).getName());
                if (i < identifiers.size() - 1) result.append(".");
            }
        }

        return result.toString();
    }

    private void extractStyles() {
        if (currentProgram == null) {
            stylesCSS = getDefaultCSS();
            return;
        }

        ComponentDecorator component = currentProgram.getComponent();
        if (component != null && component.getComponentObject() != null) {
            Styles styles = component.getComponentObject().getStyles();
            if (styles != null) {
                stylesCSS = processStyles(styles);
                System.out.println("✅ Extracted styles");
                return;
            }
        }

        stylesCSS = getDefaultCSS();
    }

    private String processStyles(Styles styles) {
        if (styles == null || styles.getRules() == null) {
            return getDefaultCSS();
        }

        StringBuilder css = new StringBuilder();
        css.append(getDefaultCSS()).append("\n");

        for (CssRule rule : styles.getRules()) {
            if (rule == null) continue;

            String selector = fixCssSelector(rule.getRule());
            css.append(selector).append(" {\n");

            if (rule.getDeclarations() != null) {
                for (CssDeclaration decl : rule.getDeclarations()) {
                    if (decl == null) continue;

                    String property = decl.getCss();
                    String value = processCssValue(decl.getProperty());
                    if (!value.isEmpty()) {
                        css.append("    ").append(property).append(": ").append(value).append(";\n");
                    }
                }
            }

            css.append("}\n");
        }

        return css.toString();
    }

    private String fixCssSelector(String selector) {
        if (selector == null) return "";
        return selector.replace("u1", "ul")
                .replace("di1", "div")
                .replace("spam", "span");
    }

    private String processCssValue(PropertyValue propertyValue) {
        if (propertyValue == null) return "";

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

    private void extractFormFields() {
        if (currentProgram == null || currentProgram.getStatements() == null) {
            setDefaultFormFields();
            return;
        }

        for (Statement stmt : currentProgram.getStatements()) {
            if (stmt != null && stmt.getDec() != null && stmt.getDec().getVariableDecl() != null) {
                VariableDecl varDecl = stmt.getDec().getVariableDecl();
                if (varDecl.getName() != null && "product".equals(varDecl.getName().getName())) {
                    System.out.println("✅ Found product definition");
                    extractProductFields(varDecl);
                    return;
                }
            }

            if (stmt != null && stmt.getExpr() != null && stmt.getExpr().getInitialize() != null) {
                Initialize init = stmt.getExpr().getInitialize();
                if (init.getIdentifier() != null && "product".equals(init.getIdentifier().getName())) {
                    System.out.println("✅ Found product initialization");
                    setDefaultFormFields();
                    return;
                }
            }
        }

        setDefaultFormFields();
    }

    private void extractProductFields(VariableDecl varDecl) {
        if (varDecl.getValue() != null && varDecl.getValue().getObjectLiteral() != null) {
            ObjectLiteral objLiteral = varDecl.getValue().getObjectLiteral();
            if (objLiteral.getObject() != null && objLiteral.getObject().getObjects() != null) {
                for (ObjectKeyValue kv : objLiteral.getObject().getObjects()) {
                    String key = kv.getKey().replaceAll("[\"']", "");
                    formFields.put(key, getFieldLabel(key));
                    System.out.println("🔍 Found product field: " + key);
                }
            }
        } else {
            setDefaultFormFields();
        }
    }

    private void setDefaultFormFields() {
        formFields.put("name", "اسم المنتج");
        formFields.put("desc", "الوصف");
        formFields.put("image", "رابط الصورة");
        System.out.println("🔍 Using default form fields");
    }

    private String getDefaultCSS() {
        return "body { font-family: Arial, sans-serif; padding: 20px; background: #f5f5f5; }\n" +
                ".form-container { background: white; padding: 20px; border-radius: 8px; box-shadow: 0 2px 4px rgba(0,0,0,0.1); max-width: 500px; margin: 0 auto; }\n" +
                ".form-group { margin: 15px 0; }\n" +
                "label { display: inline-block; width: 120px; font-weight: bold; margin-bottom: 5px; }\n" +
                "input, textarea { padding: 8px; border: 1px solid #ddd; border-radius: 4px; width: 300px; }\n" +
                "textarea { height: 80px; resize: vertical; }\n" +
                "button { background: #007bff; color: white; padding: 10px 20px; border: none; border-radius: 4px; cursor: pointer; margin-top: 10px; }\n" +
                "button:hover { background: #0056b3; }\n" +
                "h1, h2, h3, h4, h5, h6 { text-align: center; color: #333; margin-bottom: 20px; }";
    }

    public void writeToDisk(Path outputDir) throws Exception {
        Files.createDirectories(outputDir);
        String htmlContent = generateCompleteHTML();
        Files.writeString(outputDir.resolve("addProduct.html"), htmlContent,
                StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println("✅ Generated: addProduct.html");
    }

    private String generateCompleteHTML() {
        // استخدام القيم المستخرجة ديناميكياً
        return "<!DOCTYPE html>\n" +
                "<html lang=\"ar\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>" + pageTitle + "</title>\n" +
                "    <style>\n" +
                stylesCSS +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"form-container\">\n" +
                "        <" + titleTag + ">" + pageTitle + "</" + titleTag + ">\n" +
                generateDynamicForm() +
                "        <div id=\"message\"></div>\n" +
                "    </div>\n" +
                "    <script>\n" +
                generateJavaScript() +
                "    </script>\n" +
                "</body>\n" +
                "</html>";
    }

    private String generateDynamicForm() {
        StringBuilder formBuilder = new StringBuilder();
        formBuilder.append("        <form id=\"productForm\">\n");

        // إنشاء الحقول ديناميكياً بناءً على البيانات المستخرجة
        for (Map.Entry<String, String> field : formFields.entrySet()) {
            String fieldName = field.getKey();
            String fieldLabel = fieldLabels.getOrDefault(fieldName, field.getValue());

            formBuilder.append("            <div class=\"form-group\">\n");
            formBuilder.append("                <label for=\"").append(fieldName).append("\">")
                    .append(fieldLabel).append(":</label>\n");

            if ("desc".equals(fieldName)) {
                formBuilder.append("                <textarea id=\"").append(fieldName)
                        .append("\" name=\"").append(fieldName).append("\" required></textarea>\n");
            } else {
                formBuilder.append("                <input type=\"text\" id=\"").append(fieldName)
                        .append("\" name=\"").append(fieldName).append("\" required>\n");
            }

            formBuilder.append("            </div>\n");
        }

        formBuilder.append("            <button type=\"button\" onclick=\"addProduct()\">إضافة المنتج</button>\n");
        formBuilder.append("        </form>\n");

        return formBuilder.toString();
    }

    private String generateJavaScript() {
        StringBuilder js = new StringBuilder();
        js.append("// كائن المنتج\n");
        js.append("const product = {\n");

        // إنشاء كائن المنتج ديناميكياً
        List<String> fields = new ArrayList<>();
        for (String fieldName : formFields.keySet()) {
            fields.add("    " + fieldName + ": ''");
        }
        js.append(String.join(",\n", fields));

        js.append("\n};\n\n");
        js.append("// تحديث القيم عند الكتابة في الحقول\n");
        js.append("document.querySelectorAll('input, textarea').forEach(input => {\n");
        js.append("    input.addEventListener('input', function(e) {\n");
        js.append("        product[this.name] = e.target.value;\n");
        js.append("    });\n");
        js.append("});\n\n");
        js.append("// دالة الإضافة\n");
        js.append("function addProduct() {\n");
        js.append("    const messageDiv = document.getElementById('message');\n");
        js.append("    \n");
        js.append("    // التحقق من جميع الحقول المطلوبة\n");
        js.append("    const allFilled = ");

        // التحقق ديناميكياً من جميع الحقول
        List<String> fieldChecks = new ArrayList<>();
        for (String fieldName : formFields.keySet()) {
            fieldChecks.add("product." + fieldName);
        }
        js.append(String.join(" && ", fieldChecks));

        js.append(";\n    \n");
        js.append("    if (allFilled) {\n");
        js.append("        console.log('تمت إضافة المنتج:', product);\n");
        js.append("        messageDiv.innerHTML = '<p style=\"color: green; margin-top: 10px;\">✅ تمت إضافة المنتج بنجاح!</p>';\n");
        js.append("        \n");
        js.append("        // إعادة تعيين الحقول\n");
        js.append("        document.querySelectorAll('input, textarea').forEach(input => {\n");
        js.append("            input.value = '';\n");
        js.append("        });\n");
        js.append("        \n");
        js.append("        // إعادة تعيين الكائن\n");
        for (String fieldName : formFields.keySet()) {
            js.append("        product.").append(fieldName).append(" = '';\n");
        }
        js.append("        \n");
        js.append("        // إخفاء الرسالة بعد 3 ثوان\n");
        js.append("        setTimeout(() => {\n");
        js.append("            messageDiv.innerHTML = '';\n");
        js.append("        }, 3000);\n");
        js.append("    } else {\n");
        js.append("        messageDiv.innerHTML = '<p style=\"color: red; margin-top: 10px;\">❌ يرجى ملء جميع الحقول!</p>';\n");
        js.append("    }\n");
        js.append("}\n\n");
        js.append("// تهيئة التطبيق\n");
        js.append("document.addEventListener('DOMContentLoaded', function() {\n");
        js.append("    console.log('Product form loaded');\n");
        js.append("});");

        return js.toString();
    }
}