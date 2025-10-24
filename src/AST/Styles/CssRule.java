package AST.Styles;

import java.util.ArrayList;
import java.util.List;

public class CssRule {
    private String rule;
    private List<CssDeclaration> declarations = new ArrayList<CssDeclaration>();

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public List<CssDeclaration> getDeclarations() {
        return declarations;
    }

    public void setDeclarations(List<CssDeclaration> declarations) {
        this.declarations = declarations;
    }

    public void addDeclaration(CssDeclaration declaration) {
        declarations.add(declaration);
    }

    @Override
    public String toString() {
        return "CssRule { " +
                "rule = '" + rule + '\'' +
                ", declarations = " + declarations +
                '}';
    }
}
