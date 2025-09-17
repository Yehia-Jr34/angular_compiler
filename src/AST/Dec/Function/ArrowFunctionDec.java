package AST.Dec.Function;

public class ArrowFunctionDec {
    private FunctionParameters functionParameters;
    private FunctionBody functionBody;

    public FunctionParameters getFunctionParameters() {
        return functionParameters;
    }

    public void setFunctionParameters(FunctionParameters functionParameters) {
        this.functionParameters = functionParameters;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }

    @Override
    public String toString() {
        return "ArrowFunctionDec { " +
                "functionParameters = " + functionParameters +
                ", functionBody = " + functionBody +
                '}';
    }
}
