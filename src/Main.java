import ErrorHandling.CustomErrorListener;
import LexerAndParser.AngularLexer;
import LexerAndParser.AngularParser;
import Viewer.ASTViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    static String inputFile = "D:\\F.I.T.E\\Fifth Year\\S2\\Compiler\\Last_Angular_Compiler\\src\\Tests\\test311.txt";
    static String errorFile = "D:\\F.I.T.E\\Fifth Year\\S2\\Compiler\\Last_Angular_Compiler\\src\\Errors\\Errors.txt";

    public static void main(String[] args) throws IOException {
        try {
            CharStream input = CharStreams.fromPath(Paths.get(inputFile));

            AngularLexer lexer = new AngularLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            CustomErrorListener errorListener = new CustomErrorListener(errorFile);
            lexer.addErrorListener(errorListener);

            AngularParser parser = new AngularParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            ParseTree tree = parser.prog();

            errorListener.close();

            ASTViewer.showAST(tree);

            // Program = visit
            // value = program.generateCode() =>
            // file.write(value)

        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        }
    }
}