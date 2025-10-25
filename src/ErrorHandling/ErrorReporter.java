package ErrorHandling;

import java.util.ArrayList;
import java.util.List;

public class ErrorReporter {
    private List<CompilerError> errors;
    private List<CompilerError> warnings;
    private boolean hasErrors;

    public ErrorReporter() {
        this.errors = new ArrayList<>();
        this.warnings = new ArrayList<>();
        this.hasErrors = false;
    }

    public void reportError(CompilerError error) {
        errors.add(error);
        hasErrors = true;
    }

    public void reportError(ErrorType errorType, String message, int line, int column) {
        reportError(new CompilerError(errorType, message, line, column));
    }

    public void reportError(ErrorType errorType, String message, int line, int column, String scope) {
        reportError(new CompilerError(errorType, message, line, column, scope));
    }

    public void reportWarning(CompilerError warning) {
        warnings.add(warning);
    }

    public void reportWarning(ErrorType errorType, String message, int line, int column) {
        reportWarning(new CompilerError(errorType, message, line, column));
    }

    public boolean hasErrors() {
        return hasErrors;
    }

    public boolean hasWarnings() {
        return !warnings.isEmpty();
    }

    public List<CompilerError> getErrors() {
        return new ArrayList<>(errors);
    }

    public List<CompilerError> getWarnings() {
        return new ArrayList<>(warnings);
    }

    public void clear() {
        errors.clear();
        warnings.clear();
        hasErrors = false;
    }

    public void printReport() {
        if (hasErrors()) {
            System.err.println("============== COMPILATION ERRORS ==============");
            for (CompilerError error : errors) {
                System.err.println("❌ " + error);
            }
        }

        if (hasWarnings()) {
            System.out.println("============== COMPILATION WARNINGS ==============");
            for (CompilerError warning : warnings) {
                System.out.println("⚠️ " + warning);
            }
        }

        if (!hasErrors() && !hasWarnings()) {
            System.out.println("✅ Compilation completed successfully with no errors or warnings.");
        } else if (hasErrors()) {
            System.err.println("❌ Compilation failed with " + errors.size() + " error(s) and " + warnings.size() + " warning(s).");
        } else {
            System.out.println("✅ Compilation completed with " + warnings.size() + " warning(s).");
        }
    }
}