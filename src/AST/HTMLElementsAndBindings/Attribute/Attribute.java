package AST.HTMLElementsAndBindings.Attribute;

public class Attribute {
    private AttributeName name;
    private AttributeValue value;

    public AttributeName getName() {
        return name;
    }

    public void setName(AttributeName name) {
        this.name = name;
    }

    public AttributeValue getValue() {
        return value;
    }

    public void setValue(AttributeValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Attribute { " +
                "name = " + name +
                ", value = " + value +
                '}';
    }
}
