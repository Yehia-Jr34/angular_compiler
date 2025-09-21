


import LexerAndParser.AngularLexer;
import LexerAndParser.AngularParser;
import LexerAndParser.AngularParserBaseVisitor;
import Viewer.ASTViewer;
import Visitor.BaseVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        String inputFile = "D:\\F.I.T.E\\Fifth Year\\S2\\Compiler\\Last_Angular_Compiler\\src\\Tests\\test311.txt";
//        String errorFile = "src/Errors/test6.err";

        try {
            CharStream input = CharStreams.fromPath(Paths.get(inputFile));

            ParseTree tree = getParseTree(input);

            ASTViewer.showAST(tree);

            // Program = visit
            // value = program.genereateCode() =>
            // file.write(value)
//            errorListener.close();

        } catch (IOException e) {
            System.err.println("IO error: " + e.getMessage());
        }
    }

    private static ParseTree getParseTree(CharStream input) {
        AngularLexer lexer = new AngularLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

//            lexer.removeErrorListeners();

//            CustomErrorListener errorListener = new CustomErrorListener(errorFile);
//            lexer.addErrorListener(errorListener);


        AngularParser parser = new AngularParser(tokens);

//            parser.removeErrorListeners();
//            parser.addErrorListener(errorListener);

        ParseTree tree = parser.prog();
        return tree;
    }
}
