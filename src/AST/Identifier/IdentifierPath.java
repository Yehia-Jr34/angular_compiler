package AST.Identifier;

import java.util.ArrayList;
import java.util.List;

public class IdentifierPath {
    private List<Identifier> identifiers  = new ArrayList<Identifier>();

    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    public void addIdentifier(Identifier identifier) {
        this.identifiers.add(identifier);
    }

    @Override
    public String toString() {
        return "IdentifierPath { " +
                "identifiers = " + identifiers +
                '}';
    }
}
