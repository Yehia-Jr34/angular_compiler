package AST.ComponentDecorator;

import AST.Identifier.Identifier;

public class ComponentDecorator {
    private Identifier identifier;
    private ComponentObject componentObject;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public ComponentObject getComponentObject() {
        return componentObject;
    }

    public void setComponentObject(ComponentObject compoenentObject) {
        this.componentObject = compoenentObject;
    }

    @Override
    public String toString() {
        return "ComponentDecorator { " +
                "identifier = " + identifier +
                ", componentObject = " + componentObject +
                '}';
    }
}
