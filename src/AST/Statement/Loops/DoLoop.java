package AST.Statement.Loops;

import AST.Block;

import java.util.List;

public class DoLoop {
    private Block body;
    private List<Expr> exprs;

    public Block getBody() {
        return body;
    }

    public void setBody(Block body) {
        this.body = body;
    }

    public List<Expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<Expr> exprs) {
        this.exprs = exprs;
    }

    public void addExpr(Expr expr) {
        this.exprs.add(expr);
    }

    @Override
    public String toString() {
        return "DoLoop { " +
                "body = " + body +
                ", exprs = " + exprs +
                '}';
    }
}
