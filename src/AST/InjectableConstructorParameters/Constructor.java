package AST.InjectableConstructorParameters;

import AST.Block;

public class Constructor {
    private InjectableFunctionParameters parameters;
    private Block block;

    public InjectableFunctionParameters getParameters() {
        return parameters;
    }

    public void setParameters(InjectableFunctionParameters parameters) {
        this.parameters = parameters;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "Constructor { " +
                "parameters = " + parameters +
                ", block = " + block +
                '}';
    }
}
