package AST.Statement.Loops;

import AST.Block;
import AST.Expr.Expr;

import java.util.List;

public class DoLoop {
    private Block body;
    private Expr expr;

    public Block getBody() {
        return body;
    }

    public void setBody(Block body) {
        this.body = body;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "DoLoop { " +
                "body = " + body +
                ", expr = " + expr +
                '}';
    }
}
