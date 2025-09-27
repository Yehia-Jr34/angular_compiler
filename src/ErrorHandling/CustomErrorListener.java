package ErrorHandling;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CustomErrorListener extends BaseErrorListener {

    private BufferedWriter writer;

    public CustomErrorListener(String errorFilePath) throws IOException {
        writer = new BufferedWriter(new FileWriter(errorFilePath, true)); // append mode
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String error = String.format("Syntax error at line %d:%d - %s%n", line, charPositionInLine, msg);
        System.err.print(error);
        try {
            writer.write(error);
            writer.flush();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public void close() throws IOException {
        writer.close();
    }
}

