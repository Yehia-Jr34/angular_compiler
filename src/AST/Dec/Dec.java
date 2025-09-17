package AST.Dec;

import AST.Dec.Function.NormalFunctionDeclaration;
import AST.Dec.Variable.VariableDecl;
import AST.Dec.Variable.VariableTypeDecl;

public class Dec {
    private VariableDecl variableDecl = null;
    private VariableTypeDecl variableTypeDecl = null;
    private NormalFunctionDeclaration normalFunctionDeclaration = null;

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

    public NormalFunctionDeclaration getNormalFunctionDeclaration() {
        return normalFunctionDeclaration;
    }

    public void setNormalFunctionDeclaration(NormalFunctionDeclaration normalFunctionDeclaration) {
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
