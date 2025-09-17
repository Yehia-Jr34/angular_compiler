package AST.Statement;

import AST.Block;

import java.util.List;

public class IfStatement {
    private List<Expr> exprs;
    private AST.Block block;
    private AST.Block elseBlock;

    public List<Expr> getExprs() {
        return exprs;
    }

    public void setExprs(List<Expr> exprs) {
        this.exprs = exprs;
    }

    public AST.Block getBlock() {
        return block;
    }

    public void setBlock(AST.Block block) {
        this.block = block;
    }

    public AST.Block getElseBlock() {
        return elseBlock;
    }

    public void setElseBlock(Block elseBlock) {
        this.elseBlock = elseBlock;
    }

    @Override
    public String toString() {
        return "IfStatement { " +
                "exprs = " + exprs +
                ", block = " + block +
                ", elseBlock = " + (elseBlock != null ? elseBlock : "Not Used" ) +
                '}';
    }
}
