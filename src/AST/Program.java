package AST;

import AST.ComponentDecorator.ComponentDecorator;
import AST.Identifier.Identifier;
import AST.Import.ImportStatement;
import AST.Statement.Statement;
import AST.StoreDec.StoreDec;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<ImportStatement> imports = new ArrayList<ImportStatement>();
    private List<StoreDec> stores = new ArrayList<>();
    private ComponentDecorator component;
    private Identifier className;
    private List<Statement> statements = new ArrayList<>();

    public List<ImportStatement> getImports() {
        return imports;
    }

    public void setImports(List<ImportStatement> imports) {
        this.imports = imports;
    }

    public List<StoreDec> getStores() {
        return stores;
    }

    public void setStores(List<StoreDec> stores) {
        this.stores = stores;
    }

    public ComponentDecorator getComponent() {
        return component;
    }

    public void setComponent(ComponentDecorator component) {
        this.component = component;
    }

    public Identifier getClassName() {
        return className;
    }

    public void setClassName(Identifier className) {
        this.className = className;
    }

    public void addImport(ImportStatement importStatement) {
        imports.add(importStatement);
    }

    public void addStore(StoreDec storeDec) {
        stores.add(storeDec);
    }

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
        return "Program { " +
                "imports = " + (imports != null ? imports : "[]") +
                ", stores = " + (stores != null ? stores : "[]") +
                ", components = " + (component != null ? component : "") +
                ", className = '" + (className != null ? className : "") + '\'' +
                ", statements = " + (statements != null ? statements : "[]") +
                " }";
    }
}
