package AST.Dec.Function;

import AST.Identifier.DataType;
import AST.Identifier.Identifier;

public class VariableFunctionSingleArgument {
    private Identifier identifier;
    private DataType dataType;

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
        return "VariableFunctionSingleArgument { " +
                "identifier = " + identifier +
                ", dataType = " + dataType +
                '}';
    }
}
