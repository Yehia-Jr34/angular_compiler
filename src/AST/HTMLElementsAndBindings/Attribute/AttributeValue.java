package AST.HTMLElementsAndBindings.Attribute;

import AST.Identifier.IdentifierPath;

public class AttributeValue {
    private String value = null;
    private IdentifierPath path = null;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public IdentifierPath getPath() {
        return path;
    }

    public void setPath(IdentifierPath path) {
        this.path = path;
    }

    @Override
    public String toString() {
        if (path != null) {
            return "AttributeValue { " +
                    "path = " + path +
                    '}';
        } else {
            return "AttributeValue { " +
                    "value = '" + value + '\'' +
                    '}';
        }
    }
}
