package ErrorHandling;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomErrorListener extends BaseErrorListener {

    private BufferedWriter writer;
    private String errorFilePath;
    private int errorCount = 0;

    public CustomErrorListener(String errorFilePath) throws IOException {
        this.errorFilePath = errorFilePath;
        writer = new BufferedWriter(new FileWriter(errorFilePath, true)); // append mode

        // إضافة رأس للجلسة الجديدة
        String header = String.format("%n%n=== Compilation Session: %s ===%n",
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        writer.write(header);
        writer.flush();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        errorCount++;
        String error = String.format("[ERROR %d] Syntax error at line %d:%d - %s%n",
                errorCount, line, charPositionInLine, msg);

        System.err.print(error);
        try {
            writer.write(error);
            writer.flush();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void close() throws IOException {
        // إضافة خاتمة
        String footer = String.format("=== Total syntax errors: %d ===%n", errorCount);
        writer.write(footer);
        writer.close();
    }
}