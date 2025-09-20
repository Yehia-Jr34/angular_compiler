package AST.Dec.Function;

import AST.Expr.Expr;
import AST.Identifier.IdentifierPath;

import java.util.ArrayList;
import java.util.List;

public class FunctionCall {
    private IdentifierPath identifierPath;

    private List<Expr> arguments = new ArrayList<>();

    public IdentifierPath getIdentifierPath() {
        return identifierPath;
    }

    public void setIdentifierPath(IdentifierPath identifierPath) {
        this.identifierPath = identifierPath;
    }

    public List<Expr> getArguments() {
        return arguments;
    }

    public void setArguments(List<Expr> arguments) {
        this.arguments = arguments;
    }

    public void addArgument(Expr expr) {
        this.arguments.add(expr);
    }

    @Override
    public String toString() {
        return "FunctionCall { " +
                "identifierPath = " + identifierPath +
                ", arguments = " + arguments +
                '}';
    }
}
