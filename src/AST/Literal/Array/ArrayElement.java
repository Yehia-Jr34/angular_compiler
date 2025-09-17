package AST.Literal.Array;

import AST.Expr.Expr;
import AST.Identifier.Identifier;
import AST.Literal.AnyLiteral;

public class ArrayElement {
    private AnyLiteral anyLiteral = null;
    private Expr expr = null;
    private Identifier id = null;

    public AnyLiteral getAnyLiteral() {
        return anyLiteral;
    }

    public void setAnyLiteral(AnyLiteral anyLiteral) {
        this.anyLiteral = anyLiteral;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Identifier getId() {
        return id;
    }

    public void setId(Identifier id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ArrayElement { " +
                "anyLiteral = " + (anyLiteral != null ? anyLiteral : "Not Defined") +
                ", expr = " + (expr != null ? expr : "Not Defined") +
                ", id = " + (id != null ? id : "Not Defined") +
                '}';
    }
}
