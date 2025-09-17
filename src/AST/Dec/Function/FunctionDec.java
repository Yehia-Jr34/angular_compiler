package AST.Dec.Function;

public class FunctionDec {
    private NormalFunctionDec normalFunctionDec = null;
    private ArrowFunctionDec arrowFunctionDec = null;

    public NormalFunctionDec getNormalFunctionDec() {
        return normalFunctionDec;
    }

    public void setNormalFunctionDec(NormalFunctionDec normalFunctionDec) {
        this.normalFunctionDec = normalFunctionDec;
    }

    public ArrowFunctionDec getArrowFunctionDec() {
        return arrowFunctionDec;
    }

    public void setArrowFunctionDec(ArrowFunctionDec arrowFunctionDec) {
        this.arrowFunctionDec = arrowFunctionDec;
    }

    @Override
    public String toString() {
        if (normalFunctionDec != null) {
            return "FunctionDec { " +
                    "normalFunctionDec = " + normalFunctionDec +
                    '}';
        } else {
            return "FunctionDec { " +
                    "arrowFunctionDec = " + arrowFunctionDec +
                    '}';
        }
    }
}
