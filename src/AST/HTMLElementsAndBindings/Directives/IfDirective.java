package AST.HTMLElementsAndBindings.Directives;

import AST.Identifier.Identifier;
import AST.Literal.AnyLiteral;

public class IfDirective {
    private Identifier condition = null;
    private AnyLiteral anyLiteral = null;

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

    @Override
    public String toString() {
        if (anyLiteral != null) {
            return "IfDirective { " +
                    "anyLiteral = " + anyLiteral +
                    '}';
        } else {
            return "IfDirective { " +
                    "condition = " + condition +
                    '}';
        }
    }
}
