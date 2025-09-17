package AST.StoreDec;

import AST.Identifier.Identifier;
import AST.Literal.AnyLiteral;

public class StoreStateField {
    private Identifier identifier;
    private Expr expression = null;
    private AnyLiteral anyLiteral = null;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Expr getExpression() {
        return expression;
    }

    public void setExpression(Expr expression) {
        this.expression = expression;
    }

    public AnyLiteral getAnyLiteral() {
        return anyLiteral;
    }

    public void setAnyLiteral(AnyLiteral anyLiteral) {
        this.anyLiteral = anyLiteral;
    }

    @Override
    public String toString() {
        if (anyLiteral != null) {
            return "StoreStateField { " +
                    "identifier = " + identifier +
                    ", anyLiteral = " + anyLiteral +
                    '}';
        } else {
            return "StoreStateField { " +
                    "identifier = " + identifier +
                    ", expression = " + expression +
                    '}';
        }
    }
}
