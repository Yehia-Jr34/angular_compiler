package AST.Statement;

import AST.Block;
import AST.Dec.Dec;
import AST.Expr.Expr;
import AST.InjectableConstructorParameters.Constructor;
import AST.Statement.Loops.Loops;

//TODO
public class Statement {
    private Block block = null;
    private Dec dec = null;
    private Expr expr = null;
    private Loops loops = null;
    private IfStatement ifStatement = null;
    private Constructor constructor = null;
    private ConsoleLog consoleLog = null;
    private ArrayDeclaration arrayDeclaration = null;

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Dec getDec() {
        return dec;
    }

    public void setDec(Dec dec) {
        this.dec = dec;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Loops getLoops() {
        return loops;
    }

    public void setLoops(Loops loops) {
        this.loops = loops;
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public ConsoleLog getConsoleLog() {
        return consoleLog;
    }

    public void setConsoleLog(ConsoleLog consoleLog) {
        this.consoleLog = consoleLog;
    }

    public ArrayDeclaration getArrayDeclaration() {
        return arrayDeclaration;
    }

    public void setArrayDeclaration(ArrayDeclaration arrayDeclaration) {
        this.arrayDeclaration = arrayDeclaration;
    }

    @Override
    public String toString() {
        return "Statement { " +
                "block = " + (block != null ? block : "not assigned") +
                ", dec = " + (dec != null ? dec : "not assigned") +
                ", expr = " + (expr != null ? expr : "not assigned") +
                ", loops = " + (loops != null ? loops : "not assigned") +
                ", ifStatement = " + (ifStatement != null ? ifStatement : "not assigned") +
                ", constructor = " + (constructor != null ? constructor : "not assigned") +
                ", consoleLog = " + (consoleLog != null ? consoleLog : "not assigned") +
                ", arrayDeclaration = " + (arrayDeclaration != null ? arrayDeclaration : "not assigned") +
                '}';
    }
}
