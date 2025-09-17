package AST.InjectableConstructorParameters;

public class AccessModifiers {
    private String modifier;

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    @Override
    public String toString() {
        return "AccessModifiers { " +
                "modifier = '" + modifier + '\'' +
                '}';
    }
}
