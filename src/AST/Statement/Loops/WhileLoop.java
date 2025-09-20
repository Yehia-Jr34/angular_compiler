package AST.Statement.Loops;

import AST.Block;
import AST.Expr.Expr;

import java.util.ArrayList;
import java.util.List;

public class WhileLoop {
    private Expr expr = new Expr();
    private Block block;

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "WhileLoop { " +
                "expr = " + expr +
                ", block = " + block +
                '}';
    }
}
