package AST.Literal;

import AST.Literal.Array.ArrayLiteral;
import AST.Literal.Object.ObjectLiteral;

public class AnyLiteral {
    private ArrayLiteral arrayLiteral = null;
    private ObjectLiteral objectLiteral = null;
    private String stringLiteral = null;
    private String boolLiteral = null;
    private String DecimalLiteral = null;
    private String nullLiteral = null;

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public String getBoolLiteral() {
        return boolLiteral;
    }

    public void setBoolLiteral(String boolLiteral) {
        this.boolLiteral = boolLiteral;
    }

    public String getDecimalLiteral() {
        return DecimalLiteral;
    }

    public void setDecimalLiteral(String decimalLiteral) {
        DecimalLiteral = decimalLiteral;
    }

    public String getNullLiteral() {
        return nullLiteral;
    }

    public void setNullLiteral(String nullLiteral) {
        this.nullLiteral = nullLiteral;
    }

    @Override
    public String toString() {
        return "AnyLiteral{" +
                "arrayLiteral=" + (arrayLiteral != null ? arrayLiteral : "[]") +
                ", objectLiteral=" + (objectLiteral != null ? objectLiteral : "{}") +
                ", stringLiteral='" + (stringLiteral != null ? stringLiteral : "") + '\'' +
                ", boolLiteral='" + (boolLiteral != null ? boolLiteral : "") + '\'' +
                ", DecimalLiteral='" + (DecimalLiteral != null ? DecimalLiteral : "") + '\'' +
                ", nullLiteral='" + (nullLiteral != null ? nullLiteral : "null") + '\'' +
                '}';
    }
}
