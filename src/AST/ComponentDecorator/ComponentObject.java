package AST.ComponentDecorator;

import AST.HTMLAndInterpolation.HTML.HTML;
import AST.Styles.Styles;

public class ComponentObject {
    private String componentName;
    private HTML template;
    private Styles styles;

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public HTML getTemplate() {
        return template;
    }

    public void setTemplate(HTML template) {
        this.template = template;
    }

    public Styles getStyles() {
        return styles;
    }

    public void setStyles(Styles styles) {
        this.styles = styles;
    }

    @Override
    public String toString() {
        return "ComponentObject { " +
                "componentName = '" + componentName + '\'' +
                ", template = " + template +
                ", styles = " + styles +
                '}';
    }
}
