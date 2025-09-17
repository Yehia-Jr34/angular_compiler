package AST.Identifier;

public class DataType {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DataType { " +
                "type = '" + type + '\'' +
                '}';
    }
}
