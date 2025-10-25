package ErrorHandling;

public class TypeMismatchException extends SemanticException {
    private String expectedType;
    private String actualType;

    public TypeMismatchException(String message) {
        super(message);
    }

    public TypeMismatchException(String expectedType, String actualType, int line, int column) {
        super(String.format("Type mismatch: expected '%s' but found '%s' at line %d:%d",
                expectedType, actualType, line, column));
        this.expectedType = expectedType;
        this.actualType = actualType;
    }

    public String getExpectedType() {
        return expectedType;
    }

    public String getActualType() {
        return actualType;
    }
}