package AST.Dec.Function;

import AST.Identifier.Identifier;

public class NormalFunctionDec {
    private Identifier name;
    private FunctionParameters functionParameters;
    private FunctionBody body;

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    public FunctionParameters getFunctionParameters() {
        return functionParameters;
    }

    public void setFunctionParameters(FunctionParameters functionParameters) {
        this.functionParameters = functionParameters;
    }

    public FunctionBody getBody() {
        return body;
    }

    public void setBody(FunctionBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "NormalFunctionDec { " +
                "name = " + name +
                ", functionParameters = " + functionParameters +
                ", body = " + body +
                '}';
    }
}
