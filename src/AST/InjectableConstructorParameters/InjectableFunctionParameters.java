package AST.InjectableConstructorParameters;

import java.util.ArrayList;
import java.util.List;

public class InjectableFunctionParameters {
    private List<InjectableVariableFunctionSingleArgument> arguments = new ArrayList<>();

    public List<InjectableVariableFunctionSingleArgument> getArguments() {
        return arguments;
    }

    public void setArguments(List<InjectableVariableFunctionSingleArgument> arguments) {
        this.arguments = arguments;
    }

    public void addArgument(InjectableVariableFunctionSingleArgument argument) {
        arguments.add(argument);
    }

    @Override
    public String toString() {
        return "InjectableFunctionParameters { " +
                "arguments = " + arguments +
                '}';
    }
}
