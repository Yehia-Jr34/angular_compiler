package AST.StoreDec;

import AST.Dec.Function.ArrowFunctionDec;
import AST.Identifier.Identifier;

public class ActionDec {
    private Identifier identifier;
    private ArrowFunctionDec arrowFunctionDec;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public ArrowFunctionDec getArrowFunctionDec() {
        return arrowFunctionDec;
    }

    public void setArrowFunctionDec(ArrowFunctionDec arrowFunctionDec) {
        this.arrowFunctionDec = arrowFunctionDec;
    }

    @Override
    public String toString() {
        return "ActionDec { " +
                "identifier = " + identifier +
                ", arrowFunctionDec = " + arrowFunctionDec +
                '}';
    }
}
