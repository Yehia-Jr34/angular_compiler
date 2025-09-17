package AST.Initialize;

import AST.Expr.Expr;
import AST.Identifier.Identifier;
import AST.Literal.AnyLiteral;

public class Initialize {
    private Identifier identifier;
    private Expr expr = null;
    private AnyLiteral anyLiteral = null;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public AnyLiteral getAnyLiteral() {
        return anyLiteral;
    }

    public void setAnyLiteral(AnyLiteral anyLiteral) {
        this.anyLiteral = anyLiteral;
    }

    @Override
    public String toString() {
        return "Initialize { " +
                "identifier = " + identifier +
                ", expr = " + (expr != null ? expr : "Not assigned") +
                ", anyLiteral = " + (anyLiteral != null ? anyLiteral : "Not assigned") +
                '}';
    }
}
