package AST.Import;

import AST.Identifier.Identifier;

import java.util.List;

public class ImportStatement {
    private Identifier identifier;
    private String fileName;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "ImportStatement { " +
                "identifier = " + identifier +
                ", fileName = " + fileName +
                '}';
    }
}
