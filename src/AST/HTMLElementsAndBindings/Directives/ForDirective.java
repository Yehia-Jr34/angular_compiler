package AST.HTMLElementsAndBindings.Directives;

import AST.Identifier.Identifier;

public class ForDirective {
    private Identifier identifier1 = null;
    private Identifier identifier2 = null;

    private String expression = null;

    public Identifier getIdentifier1() {
        return identifier1;
    }

    public void setIdentifier1(Identifier identifier1) {
        this.identifier1 = identifier1;
    }

    public Identifier getIdentifier2() {
        return identifier2;
    }

    public void setIdentifier2(Identifier identifier2) {
        this.identifier2 = identifier2;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        if (identifier1 != null && identifier2 != null) {
            return "ForDirective { " +
                    "identifier1 = " + identifier1 +
                    ", identifier2 = " + identifier2 +
                    '}';
        } else {
            return "ForDirective { " +
                    "expression = " + expression +
                    '}';
        }
    }
}
