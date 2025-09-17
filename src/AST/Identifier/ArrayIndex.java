package AST.Identifier;

import AST.Expr.Expr;

import java.util.List;

public class ArrayIndex {
    private List<Expr> index;

    public List<Expr> getIndex() {
        return index;
    }

    public void setIndex(List<Expr> index) {
        this.index = index;
    }

    public void addExpr(Expr e) {
        this.index.add(e);
    }

    @Override
    public String toString() {
        return "ArrayIndex { " +
                "index = " + index +
                '}';
    }
}
