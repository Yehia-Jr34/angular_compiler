package AST.HTMLElementsAndBindings.Attribute;

import AST.Identifier.IdentifierPath;

public class BoundAttribute {
    private AttributeName name;
    private IdentifierPath bound;

    public AttributeName getName() {
        return name;
    }

    public void setName(AttributeName name) {
        this.name = name;
    }

    public IdentifierPath getBound() {
        return bound;
    }

    public void setBound(IdentifierPath bound) {
        this.bound = bound;
    }

    @Override
    public String toString() {
        return "BoundAttribute { " +
                "name = " + name +
                ", bound = " + bound +
                '}';
    }
}
