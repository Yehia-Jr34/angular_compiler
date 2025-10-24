package AST.Statement;

import AST.Identifier.Identifier;
import AST.Literal.Array.ArrayLiteral;

public class ArrayDeclaration {
    private Identifier identifier;
    private ArrayLiteral arrayLiteral;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    @Override
    public String toString() {
        return "ArrayDeclaration { " +
                "identifier = " + identifier +
                ", arrayLiteral = " + arrayLiteral +
                '}';
    }
}
