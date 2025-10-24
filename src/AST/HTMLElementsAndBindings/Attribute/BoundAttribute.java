package AST.HTMLElementsAndBindings.Attribute;

import AST.Identifier.IdentifierPath;

public class BoundAttribute {
    private AttributeName name = null;
    private IdentifierPath bound = null;
    private String value = null;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BoundAttribute { " +
                "name = " + name +
                ", bound = " + bound +
                ", value = " + value +
                '}';
    }
}
