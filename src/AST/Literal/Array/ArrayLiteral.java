package AST.Literal.Array;

public class ArrayLiteral {
    private ArrayList array;

    public ArrayList getArray() {
        return array;
    }

    public void setArray(ArrayList array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArrayLiteral { " +
                "array = " + array +
                '}';
    }
}
