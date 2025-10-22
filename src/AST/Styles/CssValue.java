package AST.Styles;

public class CssValue {
    private String decimalLiteral;
    private String CssUnit;

    public String getDecimalLiteral() {
        return decimalLiteral;
    }

    public void setDecimalLiteral(String decimalLiteral) {
        this.decimalLiteral = decimalLiteral;
    }

    public String getCssUnit() {
        return CssUnit;
    }

    public void setCssUnit(String cssUnit) {
        CssUnit = cssUnit;
    }

    @Override
    public String toString() {
        return "CssValue { " +
                "decimalLiteral = '" + decimalLiteral + '\'' +
                ", CssUnit = '" + CssUnit + '\'' +
                '}';
    }
}
