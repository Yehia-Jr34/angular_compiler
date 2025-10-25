import CodeGeneration.CodeGenerator;
import ErrorHandling.CustomErrorListener;
import LexerAndParser.AngularLexer;
import LexerAndParser.AngularParser;
import Visitor.BaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    static String inputFile = "D:\\F.I.T.E\\Fifth Year\\S2\\Compiler\\Last_Angular_Compiler\\src\\Tests\\test7.txt";
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

            AngularParser.ProgContext parseTree = parser.prog();
            errorListener.close();

            // بناء AST باستخدام Visitor
            BaseVisitor visitor = new BaseVisitor();
            AST.Program ast = visitor.visitProg(parseTree);

            // توليد الكود من AST
            CodeGenerator generator = new CodeGenerator();
            generator.emit(ast);
            generator.writeToDisk(Paths.get(outputFile));

            // ✅ طباعة Symbol Table هنا
            System.out.println("\n" + "=".repeat(60));
            System.out.println("📊 SYMBOL TABLE ANALYSIS");
            System.out.println("=".repeat(60));
            visitor.symbolTable.print();

            System.out.println("✅ Code generation completed. Files written to: " + outputFile);

        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Code generation error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}