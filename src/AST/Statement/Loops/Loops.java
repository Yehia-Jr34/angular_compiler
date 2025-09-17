package AST.Statement.Loops;

public class Loops {
    private ForLoop forLoop = null;
    private WhileLoop whileLoop = null;
    private DoLoop doLoop = null;

    public ForLoop getForLoop() {
        return forLoop;
    }

    public void setForLoop(ForLoop forLoop) {
        this.forLoop = forLoop;
    }

    public WhileLoop getWhileLoop() {
        return whileLoop;
    }

    public void setWhileLoop(WhileLoop whileLoop) {
        this.whileLoop = whileLoop;
    }

    public DoLoop getDoLoop() {
        return doLoop;
    }

    public void setDoLoop(DoLoop doLoop) {
        this.doLoop = doLoop;
    }

    @Override
    public String toString() {
        return "Loops { " +
                "forLoop = " + (forLoop != null ? forLoop : "Not Used") +
                ", whileLoop = " + (whileLoop != null ? whileLoop : "Not Used") +
                ", doLoop = " + (doLoop != null ? doLoop : "Not Used") +
                '}';
    }
}
