package AST.Expr;

public class Operator {
    private String operator;

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Operator { " +
                "operator = '" + operator + '\'' +
                '}';
    }
}
