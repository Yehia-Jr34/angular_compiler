package AST.Dec.Variable;

import AST.Expr.Expr;
import AST.Identifier.DataType;
import AST.Identifier.Identifier;
import AST.Literal.AnyLiteral;

public class VariableTypeDecl {
    private Identifier identifier;
    private DataType dataType;
    private AnyLiteral anyLiteral = null;
    private Expr expr = null;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public AnyLiteral getAnyLiteral() {
        return anyLiteral;
    }

    public void setAnyLiteral(AnyLiteral anyLiteral) {
        this.anyLiteral = anyLiteral;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "VariableTypeDecl { " +
                "identifier = " + identifier +
                ", dataType = " + dataType +
                ", anyLiteral = " + anyLiteral +
                ", expr = " + expr +
                '}';
    }
}
