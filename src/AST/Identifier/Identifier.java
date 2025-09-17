package AST.Identifier;

public class Identifier {
    private String name = null;
    private ArrayIndex arrayIndex = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayIndex getArrayIndex() {
        return arrayIndex;
    }

    public void setArrayIndex(ArrayIndex arrayIndex) {
        this.arrayIndex = arrayIndex;
    }

    @Override
    public String toString() {
        if (arrayIndex != null) {
            return "Identifier { " +
                    "arrayIndex = " + arrayIndex +
                    '}';
        } else {
            return "Identifier { " +
                    "name = '" + name + '\'' +
                    '}';
        }
    }
}
