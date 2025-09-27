package SymbolTable;

public class Row {
    private String type;
    private String value;
    private String dataType;
    private int line;
    private int col;
    private String name;

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }

    public String getDataType() { return dataType; }

    public void setDataType(String dataType) { this.dataType = dataType; }

    public int getLine() { return line; }

    public void setLine(int line) { this.line = line; }

    public int getCol() { return col; }

    public void setCol(int col) { this.col = col; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Row { " +
                "type = '" + type + '\'' +
                ", value = '" + value + '\'' +
                ", dataType = '" + dataType + '\'' +
                ", line = " + line +
                ", col = " + col +
                ", name = '" + name + '\'' +
                '}';
    }
}
