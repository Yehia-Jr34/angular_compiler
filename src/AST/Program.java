package AST;

import AST.ComponentDecorator.ComponentDecorator;
import AST.Identifier.Identifier;
import AST.Import.ImportStatement;
import AST.Statement.Statement;
import AST.StoreDec.StoreDec;

import java.util.List;

public class Program {
    private List<ImportStatement> imports;
    private List<StoreDec> stores;
    private List<ComponentDecorator> components;
    private Identifier className;
    private List<Statement> statements;

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

    public List<ComponentDecorator> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentDecorator> components) {
        this.components = components;
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

    public void addComponent(ComponentDecorator component) {
        components.add(component);
    }

    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    @Override
    public String toString() {
        return "Program { " +
                "imports = " + (imports != null ? imports : "[]") +
                ", stores = " + (stores != null ? stores : "[]") +
                ", components = " + (components != null ? components : "[]") +
                ", className = '" + (className != null ? className : "") + '\'' +
                ", statements = " + (statements != null ? statements : "[]") +
                " }";
    }
}
