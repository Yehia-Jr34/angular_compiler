package AST.Statement.Loops;

import AST.Block;

import java.util.ArrayList;
import java.util.List;

public class WhileLoop {
    private List<Expr> exprs = new ArrayList<Expr>();
    private Block block;

    public List<Expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<Expr> exprs) {
        this.exprs = exprs;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public void addExpr(Expr expr) {
        exprs.add(expr);
    }

    @Override
    public String toString() {
        return "WhileLoop { " +
                "exprs = " + exprs +
                ", block = " + block +
                '}';
    }
}
