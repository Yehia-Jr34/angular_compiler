package AST.InjectableConstructorParameters;

import AST.Identifier.DataType;
import AST.Identifier.Identifier;

public class InjectableVariableFunctionSingleArgument {
    private AccessModifiers accessModifiers;
    private Identifier identifier;
    private DataType dataType;

    public AccessModifiers getAccessModifiers() {
        return accessModifiers;
    }

    public void setAccessModifiers(AccessModifiers accessModifiers) {
        this.accessModifiers = accessModifiers;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        return "InjectableVariableFunctionSingleArgument { " +
                "accessModifiers = " + accessModifiers +
                ", identifier = " + identifier +
                ", dataType = " + dataType +
                '}';
    }
}
