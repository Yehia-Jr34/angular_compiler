package AST.HTMLElementsAndBindings.Directives;

public class StructuralDirectives {
    private ForDirective forDirective = null;
    private IfDirective ifDirective = null;

    public ForDirective getForDirective() {
        return forDirective;
    }

    public void setForDirective(ForDirective forDirective) {
        this.forDirective = forDirective;
    }

    public IfDirective getIfDirective() {
        return ifDirective;
    }

    public void setIfDirective(IfDirective ifDirective) {
        this.ifDirective = ifDirective;
    }

    @Override
    public String toString() {
        if (forDirective != null) {
            return "StructuralDirectives { " +
                    "forDirective = " + forDirective +
                    '}';
        } else {
            return "StructuralDirectives { " +
                    "ifDirective = " + ifDirective +
                    '}';
        }
    }
}
