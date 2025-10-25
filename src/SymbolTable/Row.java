package SymbolTable;

public class Row {
    private String name;
    private SymbolType symbolType;
    private String dataType;
    private String value;
    private int line;
    private int col;
    private String scope;

    public Row(String name, SymbolType symbolType, String dataType,
               int line, int col, String scope) {
        this.name = name;
        this.symbolType = symbolType;
        this.dataType = dataType;
        this.line = line;
        this.col = col;
        this.scope = scope;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public SymbolType getSymbolType() { return symbolType; }
    public void setSymbolType(SymbolType symbolType) { this.symbolType = symbolType; }

    public String getDataType() { return dataType; }
    public void setDataType(String dataType) { this.dataType = dataType; }

    public String getValue() { return value; }
    public void setValue(String value) { this.value = value; }

    public int getLine() { return line; }
    public void setLine(int line) { this.line = line; }

    public int getCol() { return col; }
    public void setCol(int col) { this.col = col; }

    public String getScope() { return scope; }
    public void setScope(String scope) { this.scope = scope; }

    @Override
    public String toString() {
        return String.format("Row { name='%s', type=%s, dataType='%s', scope='%s', line=%d, col=%d }",
                name, symbolType, dataType, scope, line, col);
    }
}