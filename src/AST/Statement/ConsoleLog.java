package AST.Statement;

import AST.Expr.Expr;

public class ConsoleLog {
    private Expr expr;

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "ConsoleLog { " +
                "expr = " + expr +
                '}';
    }
}
