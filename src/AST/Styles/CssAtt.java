package AST.Styles;

import AST.Identifier.Identifier;

public class CssAtt {
    private Identifier name;
    private String cssColor;
    private String cssHexColor;
    private CssValue cssValue;

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    public String getCssColor() {
        return cssColor;
    }

    public void setCssColor(String cssColor) {
        this.cssColor = cssColor;
    }

    public String getCssHexColor() {
        return cssHexColor;
    }

    public void setCssHexColor(String cssHexColor) {
        this.cssHexColor = cssHexColor;
    }

    public CssValue getCssValue() {
        return cssValue;
    }

    public void setCssValue(CssValue cssValue) {
        this.cssValue = cssValue;
    }

    @Override
    public String toString() {
        return "CssAtt { " +
                "name = " + name +
                ", cssColor = '" + cssColor + '\'' +
                ", cssHexColor = '" + cssHexColor + '\'' +
                ", cssValue = " + cssValue +
                '}';
    }
}
