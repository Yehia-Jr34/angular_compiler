package ErrorHandling;

public class CompilerError {
    private ErrorType errorType;
    private String message;
    private int line;
    private int column;
    private String scope;
    private String fileName;

    public CompilerError(ErrorType errorType, String message, int line, int column) {
        this(errorType, message, line, column, "global", null);
    }

    public CompilerError(ErrorType errorType, String message, int line, int column, String scope) {
        this(errorType, message, line, column, scope, null);
    }

    public CompilerError(ErrorType errorType, String message, int line, int column, String scope, String fileName) {
        this.errorType = errorType;
        this.message = message;
        this.line = line;
        this.column = column;
        this.scope = scope;
        this.fileName = fileName;
    }

    // Getters
    public ErrorType getErrorType() { return errorType; }
    public String getMessage() { return message; }
    public int getLine() { return line; }
    public int getColumn() { return column; }
    public String getScope() { return scope; }
    public String getFileName() { return fileName; }

    @Override
    public String toString() {
        String location = fileName != null ?
                String.format("%s:%d:%d", fileName, line, column) :
                String.format("line %d:%d", line, column);

        return String.format("[%s] at %s (%s): %s",
                errorType, location, scope, message);
    }
}