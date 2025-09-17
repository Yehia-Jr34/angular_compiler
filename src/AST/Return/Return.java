package AST.Return;

import AST.Expr.Expr;

public class Return {
    private Expr expr = null;

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "Return{" +
                "expr = " + (expr != null ? expr : "Not used") +
                '}';
    }
}
