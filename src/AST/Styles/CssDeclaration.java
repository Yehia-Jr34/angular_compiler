package AST.Styles;

public class CssDeclaration {
    private String css;
    private PropertyValue property;

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }

    public PropertyValue getProperty() {
        return property;
    }

    public void setProperty(PropertyValue property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "CssDeclaration { " +
                "css = '" + css + '\'' +
                ", property = " + property +
                '}';
    }
}
