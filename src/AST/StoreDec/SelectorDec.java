package AST.StoreDec;

import AST.Dec.Function.ArrowFunctionDec;
import AST.Identifier.Identifier;

public class SelectorDec {
    private Identifier selector = null;
    private ArrowFunctionDec arrowFunction = null;

    public Identifier getSelector() {
        return selector;
    }

    public void setSelector(Identifier selector) {
        this.selector = selector;
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
                "selector = " + selector +
                ", arrowFunction = " + arrowFunction +
                '}';
    }
}
