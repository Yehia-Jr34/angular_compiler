package AST.Dec.Variable;

import AST.Expr.Expr;
import AST.Identifier.Identifier;
import AST.Literal.AnyLiteral;

public class VariableDecl {
    private Identifier name;
    private AnyLiteral value = null;
    private Expr expr = null;

    public Identifier getName() {
        return name;
    }

    public void setName(Identifier name) {
        this.name = name;
    }

    public AnyLiteral getValue() {
        return value;
    }

    public void setValue(AnyLiteral value) {
        this.value = value;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "VariableDecl { " +
                "name = " + name +
                ", value = " + (value != null ? value : "Not Assigned") +
                ", expr = " + (expr != null ? expr : "Not Assigned") +
                '}';
    }
}
