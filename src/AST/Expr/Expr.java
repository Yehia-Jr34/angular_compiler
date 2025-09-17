package AST.Expr;

import AST.Dec.Function.ArrowFunctionDec;
import AST.Dec.Function.FunctionCall;
import AST.Identifier.Identifier;
import AST.Initialize.Initialize;
import AST.Literal.Array.ArrayLiteral;
import AST.Literal.Object.ObjectLiteral;
import AST.Return.Return;

public class Expr {
    private FunctionCall functionCall = null;
    private ArrayLiteral arrayLiteral = null;
    private ObjectLiteral objectLiteral = null;
    private ArrowFunctionDec arrowFunctionDec = null;
    private String stringLiteral = null;
    private ArithmeticExpr arithmeticExpr = null;
    private Expr expr = null;
    private Initialize initialize = null;
    private Return return_ = null;
    private String Break = null;
    private String Continue = null;
    private Identifier identifier = null;

    public FunctionCall getFunc() {
        return functionCall;
    }

    public void setFunc(FunctionCall func) {
        this.functionCall = func;
    }

    public ArrayLiteral getArrayLiteral() {
        return arrayLiteral;
    }

    public void setArrayLiteral(ArrayLiteral arrayLiteral) {
        this.arrayLiteral = arrayLiteral;
    }

    public ObjectLiteral getObjectLiteral() {
        return objectLiteral;
    }

    public void setObjectLiteral(ObjectLiteral objectLiteral) {
        this.objectLiteral = objectLiteral;
    }

    public ArrowFunctionDec getArrowFunctionDec() {
        return arrowFunctionDec;
    }

    public void setArrowFunctionDec(ArrowFunctionDec arrowFunctionDec) {
        this.arrowFunctionDec = arrowFunctionDec;
    }

    public String getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public ArithmeticExpr getArithmeticExpr() {
        return arithmeticExpr;
    }

    public void setArithmeticExpr(ArithmeticExpr arithmeticExpr) {
        this.arithmeticExpr = arithmeticExpr;
    }

    public Expr getExpr() {
        return expr;
    }

    public void setExpr(Expr expr) {
        this.expr = expr;
    }

    public Initialize getInitialize() {
        return initialize;
    }

    public void setInitialize(Initialize initialize) {
        this.initialize = initialize;
    }

    public Return getReturn_() {
        return return_;
    }

    public void setReturn_(Return return_) {
        this.return_ = return_;
    }

    public String getBreak() {
        return Break;
    }

    public void setBreak(String aBreak) {
        Break = aBreak;
    }

    public String getContinue() {
        return Continue;
    }

    public void setContinue(String aContinue) {
        Continue = aContinue;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "Expr { " +
                "func = " + (functionCall != null ? functionCall : "Not Defined") +
                ", arrayLiteral = " + (arrayLiteral != null ? arrayLiteral : "Not Defined") +
                ", objectLiteral = " + (objectLiteral != null ? objectLiteral : "Not Defined") +
                ", arrowFunctionDec = " + (arrowFunctionDec != null ? arrowFunctionDec : "Not Defined") +
                ", stringLiteral = '" + (stringLiteral != null ? stringLiteral : "") + '\'' +
                ", arithmeticExpr = " + (arithmeticExpr != null ? arithmeticExpr : "Not Defined") +
                ", expr = " + (expr != null ? expr : "Not Defined") +
                ", initialize = " + (initialize != null ? initialize : "Not Defined") +
                ", return_ = " + (return_ != null ? return_ : "Not Defined") +
                ", Break = '" + (Break != null ? Break : "") + '\'' +
                ", Continue = '" + (Continue != null ? Continue : "") + '\'' +
                ", identifier = " + (identifier != null ? identifier : "Not Defined") +
                " }";
    }
}
