package AST.StoreDec;

import AST.Identifier.Identifier;

public class StoreDec {
    private Identifier identifier;
    private StoreBody body;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public StoreBody getBody() {
        return body;
    }

    public void setBody(StoreBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "StoreDec { " +
                "identifier = " + identifier +
                ", body = " + body +
                '}';
    }
}
