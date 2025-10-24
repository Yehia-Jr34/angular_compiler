package AST.HTMLElementsAndBindings.Directives;

import AST.Identifier.Identifier;
import AST.Literal.AnyLiteral;

public class IfDirective {
    private Identifier condition = null;
    private AnyLiteral anyLiteral = null;
    private String expression = null;

    public Identifier getCondition() {
        return condition;
    }

    public void setCondition(Identifier condition) {
        this.condition = condition;
    }

    public AnyLiteral getThen() {
        return anyLiteral;
    }

    public void setThen(AnyLiteral then) {
        this.anyLiteral = then;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        if (anyLiteral != null) {
            return "IfDirective { " +
                    "anyLiteral = " + anyLiteral +
                    '}';
        } else if (condition != null) {
            return "IfDirective { " +
                    "condition = " + condition +
                    '}';
        } else {
            return "IfDirective { " +
                    "expression = " + expression +
                    '}';
        }
    }
}
