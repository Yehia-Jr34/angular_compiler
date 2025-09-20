package AST.Dec.Function;

import java.util.List;

public class FunctionParameters {
    private List<VariableFunctionSingleArgument> parameters;

    public List<VariableFunctionSingleArgument> getParameters() {
        return parameters;
    }

    public void setParameters(List<VariableFunctionSingleArgument> parameters) {
        this.parameters = parameters;
    }

    public void addArgument(VariableFunctionSingleArgument argument) {
        this.parameters.add(argument);
    }

    @Override
    public String toString() {
        return "FunctionParameters { " +
                "parameters = " + parameters +
                '}';
    }
}
