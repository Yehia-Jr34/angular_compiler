package AST.Statement.Loops;

import AST.Block;

public class ForLoop {
    private ForParameter forParameter;
    private Block block;

    public ForParameter getForParameter() {
        return forParameter;
    }

    public void setForParameter(ForParameter forParameter) {
        this.forParameter = forParameter;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "ForLoop { " +
                "forParameter = " + forParameter +
                ", block = " + block +
                '}';
    }
}
