package AST.Literal.Object;

import AST.Expr.Expr;

public class ObjectKeyValue {
    private String key;
    private Expr value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Expr getValue() {
        return value;
    }

    public void setValue(Expr value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ObjectKeyValue{" +
                "key = '" + key + '\'' +
                ", value = " + value +
                '}';
    }
}
