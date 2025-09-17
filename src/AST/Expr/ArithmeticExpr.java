package AST.Expr;

import AST.Identifier.Identifier;

public class ArithmeticExpr {
    private ArithmeticExpr left = null;
    private ArithmeticExpr right = null;
    private Operator operator = null;
    private String decimalLiteral = null;
    private String StringLiteral = null;
    private Identifier identifier = null;

    public ArithmeticExpr getLeft() {
        return left;
    }

    public void setLeft(ArithmeticExpr left) {
        this.left = left;
    }

    public ArithmeticExpr getRight() {
        return right;
    }

    public void setRight(ArithmeticExpr right) {
        this.right = right;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String getDecimalLiteral() {
        return decimalLiteral;
    }

    public void setDecimalLiteral(String decimalLiteral) {
        this.decimalLiteral = decimalLiteral;
    }

    public String getStringLiteral() {
        return StringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        StringLiteral = stringLiteral;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "ArithmeticExpr { " +
                "left = " + (left != null ? left : "Not Defined") +
                ", right = " + (right != null ? right : "Not Defined") +
                ", operator = " + (operator != null ? operator : "Not Defined") +
                ", decimalLiteral = '" + (decimalLiteral != null ? decimalLiteral : "") + '\'' +
                ", StringLiteral = '" + (StringLiteral != null ? StringLiteral : "") + '\'' +
                ", identifier = " + (identifier != null ? identifier : "Not Defined") +
                '}';
    }
}
