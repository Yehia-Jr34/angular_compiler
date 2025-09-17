package AST.Literal.Object;

public class ObjectLiteral {
    private ObjectBody object;

    public ObjectBody getObject() {
        return object;
    }

    public void setObject(ObjectBody object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "ObjectLiteral { " +
                "object = " + object +
                '}';
    }
}
