package AST.HTMLElementsAndBindings.Directives;

import AST.Identifier.Identifier;

public class ForDirective {
    private Identifier identifier1;
    private Identifier identifier2;

    public Identifier getIdentifier1() {
        return identifier1;
    }

    public void setIdentifier1(Identifier identifier1) {
        this.identifier1 = identifier1;
    }

    public Identifier getIdentifier2() {
        return identifier2;
    }

    public void setIdentifier2(Identifier identifier2) {
        this.identifier2 = identifier2;
    }

    @Override
    public String toString() {
        return "ForDirective { " +
                "identifier1 = " + identifier1 +
                ", identifier2 = " + identifier2 +
                '}';
    }
}
