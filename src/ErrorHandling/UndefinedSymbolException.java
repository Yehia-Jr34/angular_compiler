package ErrorHandling;

public class UndefinedSymbolException extends SemanticException {
    private String symbolName;
    private String symbolType;

    public UndefinedSymbolException(String symbolName, String symbolType, int line, int column) {
        super(String.format("Undefined %s '%s' at line %d:%d",
                symbolType, symbolName, line, column));
        this.symbolName = symbolName;
        this.symbolType = symbolType;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public String getSymbolType() {
        return symbolType;
    }
}