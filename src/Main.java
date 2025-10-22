import CodeGeneration.CodeGenerator;
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

    static String inputFile = "D:\\F.I.T.E\\Fifth Year\\S2\\Compiler\\Last_Angular_Compiler\\src\\Tests\\test5.txt";
    static String errorFile = "D:\\F.I.T.E\\Fifth Year\\S2\\Compiler\\Last_Angular_Compiler\\src\\Errors\\Errors.txt";
    static String outputFile = "D:\\F.I.T.E\\Fifth Year\\S2\\Compiler\\Last_Angular_Compiler\\src\\OutputFiles";

    public static void main(String[] args) {
        try {
            // قراءة الملف
            CharStream input = CharStreams.fromPath(Paths.get(inputFile));

            // التحليل اللغوي
            AngularLexer lexer = new AngularLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            CustomErrorListener errorListener = new CustomErrorListener(errorFile);
            lexer.addErrorListener(errorListener);

            AngularParser parser = new AngularParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            AngularParser.ProgContext tree = parser.prog();
            errorListener.close();

            // توليد الكود
            CodeGenerator generator = new CodeGenerator();
            generator.emit(tree);
            generator.writeToDisk(Paths.get(outputFile));

            System.out.println("✅ Code generation completed. Files written to: " + outputFile);

        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Code generation error: " + e.getMessage());
        }
    }

}