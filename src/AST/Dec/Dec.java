package AST.Dec;

import AST.Dec.Function.NormalFunctionDec;
import AST.Dec.Variable.VariableDecl;
import AST.Dec.Variable.VariableTypeDecl;

public class Dec {
    private VariableDecl variableDecl = null;
    private VariableTypeDecl variableTypeDecl = null;
    private NormalFunctionDec normalFunctionDeclaration = null;

    public VariableDecl getVariableDecl() {
        return variableDecl;
    }

    public void setVariableDecl(VariableDecl variableDecl) {
        this.variableDecl = variableDecl;
    }

    public VariableTypeDecl getVariableTypeDecl() {
        return variableTypeDecl;
    }

    public void setVariableTypeDecl(VariableTypeDecl variableTypeDecl) {
        this.variableTypeDecl = variableTypeDecl;
    }

    public NormalFunctionDec getNormalFunctionDeclaration() {
        return normalFunctionDeclaration;
    }

    public void setNormalFunctionDeclaration(NormalFunctionDec normalFunctionDeclaration) {
        this.normalFunctionDeclaration = normalFunctionDeclaration;
    }

    @Override
    public String toString() {
        return "Dec { " +
                "variableDecl = " + variableDecl +
                ", variableTypeDecl = " + variableTypeDecl +
                ", normalFunctionDeclaration = " + normalFunctionDeclaration +
                '}';
    }
}
