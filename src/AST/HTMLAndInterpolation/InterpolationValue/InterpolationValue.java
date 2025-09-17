package AST.HTMLAndInterpolation.InterpolationValue;

import AST.Identifier.Identifier;
import AST.Identifier.IdentifierPath;

public class InterpolationValue {
    private Identifier identifier = null;
    private IdentifierPath identifierPath = null;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public IdentifierPath getIdentifierPath() {
        return identifierPath;
    }

    public void setIdentifierPath(IdentifierPath identifierPath) {
        this.identifierPath = identifierPath;
    }

    @Override
    public String toString() {
        return "InterpolationValue{" +
                "identifier=" + (identifier != null ? identifier : "Not Defined") +
                ", identifierPath=" + (identifierPath != null ? identifierPath : "Not Defined") +
                '}';
    }
}
