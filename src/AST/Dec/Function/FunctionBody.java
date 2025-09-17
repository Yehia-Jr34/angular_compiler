package AST.Dec.Function;

import AST.Block;

public class FunctionBody {
    private Block body;

    public Block getBody() {
        return body;
    }

    public void setBody(Block body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "FunctionBody { " +
                "body = " + body +
                '}';
    }
}
