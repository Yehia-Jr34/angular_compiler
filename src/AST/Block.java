package AST;

import AST.Statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class Block {
    private List<Statement> statements = new ArrayList<Statement>();

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    @Override
    public String toString() {
        return "Block { " +
                "statements = " + statements +
                '}';
    }
}
