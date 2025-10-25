import CodeGeneration.AddProductCodeGenerator;
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

public class main2 {
    static String inputFile = "D:\\F.I.T.E\\Fifth Year\\S2\\Compiler\\Last_Angular_Compiler\\src\\Tests\\test3.txt";
    static String errorFile = "D:\\F.I.T.E\\Fifth Year\\S2\\Compiler\\Last_Angular_Compiler\\src\\Errors\\Errors.txt";
    static String outputFile = "D:\\F.I.T.E\\Fifth Year\\S2\\Compiler\\Last_Angular_Compiler\\src\\OutputFiles";

    public static void main(String[] args) {
        try {
            // قراءة الملف
            CharStream input = CharStreams.fromPath(Paths.get(inputFile));

            // التحليل اللغوي
            AngularLexer lexer = new AngularLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // ✅ تفعيل نظام الأخطاء النحوية
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

            // ✅ التحقق من الأخطاء الدلالية قبل توليد الكود
            System.out.println("\n" + "=".repeat(60));
            System.out.println("🔍 SEMANTIC ERROR ANALYSIS");
            System.out.println("=".repeat(60));

            if (visitor.hasErrors()) {
                visitor.printErrorReport();
                System.err.println("❌ Compilation failed due to semantic errors.");
                return; // إيقاف التوليد إذا كان هناك أخطاء
            } else {
                System.out.println("✅ No semantic errors found.");
            }

            // ✅ طباعة Symbol Table هنا
            System.out.println("\n" + "=".repeat(60));
            System.out.println("📊 SYMBOL TABLE ANALYSIS");
            System.out.println("=".repeat(60));
            visitor.printSymbolTable();

            // توليد الكود من AST
            AddProductCodeGenerator generator = new AddProductCodeGenerator();
            generator.emit(ast);
            generator.writeToDisk(Paths.get(outputFile));

            System.out.println("\n" + "=".repeat(60));
            System.out.println("✅ Code generation completed. Files written to: " + outputFile);
            System.out.println("=".repeat(60));

        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Code generation error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
