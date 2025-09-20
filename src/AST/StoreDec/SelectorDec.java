package AST.StoreDec;

import AST.Dec.Function.ArrowFunctionDec;
import AST.Identifier.Identifier;

public class SelectorDec {
    private Identifier identifier = null;
    private ArrowFunctionDec arrowFunction = null;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public ArrowFunctionDec getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunctionDec arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    @Override
    public String toString() {
        return "SelectorDec { " +
                "identifier = " + identifier +
                ", arrowFunction = " + arrowFunction +
                '}';
    }
}
