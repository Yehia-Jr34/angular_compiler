package AST.ComponentDecorator;

import AST.HTMLAndInterpolation.HTML.HTML;

public class ComponentObject {
    private String componentName;
    private HTML template;

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

    @Override
    public String toString() {
        return "ComponentObject { " +
                "componentName = '" + componentName + '\'' +
                ", template = " + template +
                '}';
    }
}
