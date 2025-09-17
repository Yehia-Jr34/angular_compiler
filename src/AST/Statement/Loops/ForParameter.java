package AST.Statement.Loops;

import AST.Dec.Variable.VariableDecl;

public class ForParameter {
    private VariableDecl varDecl = null;
    private Expr expr1 = null;
    private Expr expr2 = null;

    public VariableDecl getVarDecl() {
        return varDecl;
    }

    public void setVarDecl(VariableDecl varDecl) {
        this.varDecl = varDecl;
    }

    public Expr getExpr1() {
        return expr1;
    }

    public void setExpr1(Expr expr1) {
        this.expr1 = expr1;
    }

    public Expr getExpr2() {
        return expr2;
    }

    public void setExpr2(Expr expr2) {
        this.expr2 = expr2;
    }

    @Override
    public String toString() {
        return "ForParameter{" +
                "varDecl = " + (varDecl != null ? varDecl : "not used") +
                ", expr1 = " + (expr1 != null ? expr1 : "not used") +
                ", expr2 = " + (expr2 != null ? expr2 : "not used") +
                '}';
    }
}
