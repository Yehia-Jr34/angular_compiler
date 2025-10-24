package AST.HTMLAndInterpolation.InterpolationValue;

public class Interpolation {
    private InterpolationValue value;

    public InterpolationValue getValue() {
        return value;
    }

    public void setValue(InterpolationValue value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Interpolation { " +
                "value = " + value +
                '}';
    }
}
