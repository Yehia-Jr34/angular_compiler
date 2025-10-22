package CodeGeneration;

import LexerAndParser.AngularParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class CodeGenerator {

    private final StringBuilder indexHtml = new StringBuilder();
    private final StringBuilder appJs = new StringBuilder();
    private final StringBuilder detailsHtml = new StringBuilder();

    public void emit(AngularParser.ProgContext prog) {
        for (var store : prog.storeDecl()) {
            String storeName = store.identifier_().getText();
            appJs.append("const ").append(storeName).append(" = {\n");
            appJs.append(generateState(store)).append(",\n");
            appJs.append(generateActions(store)).append(",\n");
            appJs.append(generateReducer(store)).append(",\n");
            appJs.append(generateSelectors(store)).append("\n");
            appJs.append("};\n\n");
        }

        appJs.append("// Application logic\n");
        appJs.append("let appState = ProductsStore.state;\n");
        appJs.append("function dispatch(type, payload) {\n");
        appJs.append("  const reducer = ProductsStore.reducer[type];\n");
        appJs.append("  if (reducer) appState = reducer(appState, payload);\n");
        appJs.append("}\n");
        appJs.append("function select(selector) {\n");
        appJs.append("  return selector(appState);\n");
        appJs.append("}\n");

        generateMountFunction(); // ✅ توليد JS ديناميكي
        generateIndexHtml(prog);
        generateDetailsHtml();
    }

    private void generateMountFunction() {
        appJs.append("\nfunction mount() {\n");
        appJs.append("  const app = document.getElementById(\"app\");\n\n");

        // ngIf
        appJs.append("  document.querySelectorAll(\"[data-ngif]\").forEach(el => {\n");
        appJs.append("    const condition = el.getAttribute(\"data-ngif\");\n");
        appJs.append("    try {\n");
        appJs.append("      if (!eval(condition)) el.style.display = \"none\";\n");
        appJs.append("    } catch (e) {\n");
        appJs.append("      console.warn(\"ngIf eval error:\", e);\n");
        appJs.append("    }\n");
        appJs.append("  });\n\n");

        // ngFor
        appJs.append("  document.querySelectorAll(\"[data-ngfor]\").forEach(el => {\n");
        appJs.append("    const expr = el.getAttribute(\"data-ngfor\");\n");
        appJs.append("    const [item, list] = expr.split(\" of \");\n");
        appJs.append("    const data = select(ProductsStore.selectors[list.trim()]);\n");
        appJs.append("    const template = el.cloneNode(true);\n");
        appJs.append("    el.innerHTML = \"\";\n");
        appJs.append("    data.forEach(val => {\n");
        appJs.append("      const clone = template.cloneNode(true);\n");
        appJs.append("      clone.removeAttribute(\"data-ngfor\");\n");
        appJs.append("      const regex = new RegExp(`{{\\\\s*${item.trim()}\\\\.(\\\\w+)\\\\s*}}`, \"g\");\n");
        appJs.append("      clone.innerHTML = clone.innerHTML.replace(regex, (_, prop) => val[prop]);\n");
        appJs.append("      el.appendChild(clone);\n");
        appJs.append("    });\n");
        appJs.append("  });\n");

        // onclick
        appJs.append("  document.querySelectorAll(\"[onclick]\").forEach(el => {\n");
        appJs.append("    const handler = el.getAttribute(\"onclick\");\n");
        appJs.append("    el.addEventListener(\"click\", () => {\n");
        appJs.append("      try {\n");
        appJs.append("        eval(handler);\n");
        appJs.append("      } catch (e) {\n");
        appJs.append("        console.warn(\"onclick eval error:\", e);\n");
        appJs.append("      }\n");
        appJs.append("    });\n");
        appJs.append("  });\n");

        // oninput
        appJs.append("  document.querySelectorAll(\"[oninput]\").forEach(el => {\n");
        appJs.append("    const handler = el.getAttribute(\"oninput\");\n");
        appJs.append("    el.addEventListener(\"input\", () => {\n");
        appJs.append("      try {\n");
        appJs.append("        eval(handler);\n");
        appJs.append("      } catch (e) {\n");
        appJs.append("        console.warn(\"oninput eval error:\", e);\n");
        appJs.append("      }\n");
        appJs.append("    });\n");
        appJs.append("  });\n");

        appJs.append("}\n");
        appJs.append("document.addEventListener(\"DOMContentLoaded\", mount);\n");
    }

    private String generateState(AngularParser.StoreDeclContext storeCtx) {
        StringBuilder state = new StringBuilder();
        state.append("  state: {\n");

        var fields = storeCtx.storeBody().stateSection().storeStateField();
        for (int i = 0; i < fields.size(); i++) {
            var f = fields.get(i);
            String name = f.identifier_().getText();
            String value = f.anyLiteral() != null ? f.anyLiteral().getText() : f.expr().getText();
            state.append("    ").append(name).append(": ").append(value);
            if (i < fields.size() - 1) state.append(",");
            state.append("\n");
        }

        state.append("  }");
        return state.toString();
    }

    private String generateActions(AngularParser.StoreDeclContext storeCtx) {
        var section = storeCtx.storeBody().actionsSection();
        if (section == null) return "  actions: {}";

        StringBuilder actions = new StringBuilder();
        actions.append("  actions: {\n");

        var decls = section.actionDecl();
        for (int i = 0; i < decls.size(); i++) {
            var a = decls.get(i);
            String name = a.identifier_().getText();
            String body = a.arrowFunctionDecleration().getText();
            actions.append("    ").append(name).append(": ").append(body);
            if (i < decls.size() - 1) actions.append(",");
            actions.append("\n");
        }

        actions.append("  }");
        return actions.toString();
    }

    private String generateReducer(AngularParser.StoreDeclContext storeCtx) {
        var section = storeCtx.storeBody().reducerSection();
        if (section == null) return "  reducer: {}";

        StringBuilder reducer = new StringBuilder();
        reducer.append("  reducer: {\n");

        var rules = section.reducerRule();
        for (int i = 0; i < rules.size(); i++) {
            var r = rules.get(i);
            String name = r.identifier_().getText();
            String body = r.arrowFunctionDecleration().getText();
            reducer.append("    ").append(name).append(": ").append(body);
            if (i < rules.size() - 1) reducer.append(",");
            reducer.append("\n");
        }

        reducer.append("  }");
        return reducer.toString();
    }

    private String generateSelectors(AngularParser.StoreDeclContext storeCtx) {
        var section = storeCtx.storeBody().selectorsSection();
        if (section == null) return "  selectors: {}";

        StringBuilder selectors = new StringBuilder();
        selectors.append("  selectors: {\n");

        var decls = section.selectorDecl();
        for (int i = 0; i < decls.size(); i++) {
            var s = decls.get(i);
            String name = s.identifier_().getText();
            String body = s.arrowFunctionDecleration().getText();
            selectors.append("    ").append(name).append(": ").append(body);
            if (i < decls.size() - 1) selectors.append(",");
            selectors.append("\n");
        }

        selectors.append("  }");
        return selectors.toString();
    }

    private void generateIndexHtml(AngularParser.ProgContext prog) {
        var comp = prog.componentDecorator();
        var obj = comp.compoenentObject();
        var html = obj.html();

        indexHtml.append("<!DOCTYPE html>\n<html>\n<head>\n<title>Angular DSL App</title>\n</head>\n<body>\n");
        indexHtml.append("<div id=\"app\">\n");

        for (var content : html.htmlContent()) {
            indexHtml.append(processHtmlContent(content)).append("\n");
        }

        indexHtml.append("</div>\n<script src=\"app.js\"></script>\n</body>\n</html>");
    }

    private String processHtmlContent(AngularParser.HtmlContentContext ctx) {
        if (ctx.htmlElement() != null) {
            return processHtmlElement(ctx.htmlElement());
        } else if (ctx.Identifier() != null) {
            return ctx.Identifier().getText();
        } else if (ctx.interpolationValue() != null) {
            String expr = ctx.interpolationValue().getText();
            return "{{ " + expr + " }}";
        }
        return "";
    }

    private String processHtmlElement(AngularParser.HtmlElementContext elementCtx) {
        StringBuilder html = new StringBuilder();

        if (elementCtx.selfClosingTag() != null) {
            var tag = elementCtx.selfClosingTag();
            String tagName = tag.Identifier().getText();
            html.append("<").append(tagName);

            for (var attr : tag.boundAttribute()) {
                String name = attr.attributeName().getText();
                String value = attr.identifierPath().getText();
                if (name.equals("value")) {
                    html.append(" value=\"").append(value).append("\" oninput=\"").append(value).append(" = this.value\"");
                } else {
                    html.append(" ").append(name).append("=\"").append(value).append("\"");
                }
            }

            for (var event : tag.eventBinding()) {
                String eventName = event.eventName().getText();
                String handler = event.getChild(4).getText(); // functionCall or identifierPath
                html.append(" onclick=\"").append(handler).append("\"");
            }

            html.append(" />");
        } else {
            var open = elementCtx.openTag();
            var close = elementCtx.closeTag();
            String tagName = open.htmlTag().getText();
            html.append("<").append(tagName);

            // ngIf → تحويل إلى شرط داخل app.js لاحقًا
            if (open.structuralDirectives() != null && open.structuralDirectives().ifDirective() != null) {
                String condition = open.structuralDirectives().ifDirective().getChild(2).getText();
                html.append(" data-ngif=\"").append(condition).append("\"");
            }

            // ngFor → تحويل إلى تكرار داخل app.js لاحقًا
            if (open.structuralDirectives() != null && open.structuralDirectives().forDirective() != null) {
                String item = open.structuralDirectives().forDirective().identifier_(0).getText();
                String list = open.structuralDirectives().forDirective().identifier_(1).getText();
                html.append(" data-ngfor=\"").append(item).append(" of ").append(list).append("\"");
            }

            for (var attr : open.boundAttribute()) {
                String name = attr.attributeName().getText();
                String value = attr.identifierPath().getText();
                if (name.equals("value")) {
                    html.append(" value=\"").append(value).append("\" oninput=\"").append(value).append(" = this.value\"");
                } else {
                    html.append(" ").append(name).append("=\"").append(value).append("\"");
                }
            }

            for (var event : open.eventBinding()) {
                String eventName = event.eventName().getText();
                String handler = event.getChild(4).getText();
                html.append(" onclick=\"").append(handler).append("\"");
            }

            html.append(">");

            for (var content : elementCtx.htmlContent()) {
                html.append(processHtmlContent(content));
            }

            html.append("</").append(tagName).append(">");
        }

        return html.toString();
    }

    private void generateDetailsHtml() {
        detailsHtml.append("<!DOCTYPE html>\n<html>\n<head>\n<title>Details</title>\n</head>\n<body>\n");
        detailsHtml.append("<h2>Product Details</h2>\n");
        detailsHtml.append("<script>\n");
        detailsHtml.append("const data = JSON.parse(localStorage.getItem('selectedItem'));\n");
        detailsHtml.append("if (data) {\n");
        detailsHtml.append("  document.body.innerHTML += `<pre>${JSON.stringify(data, null, 2)}</pre>`;\n");
        detailsHtml.append("} else {\n");
        detailsHtml.append("  document.body.innerHTML += `<p>No product selected.</p>`;\n");
        detailsHtml.append("}\n");
        detailsHtml.append("</script>\n</body>\n</html>");
    }

    public void writeToDisk(Path outputDir) throws Exception {
        Files.writeString(outputDir.resolve("index.html"), indexHtml.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        Files.writeString(outputDir.resolve("app.js"), appJs.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        Files.writeString(outputDir.resolve("details.html"), detailsHtml.toString(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
}