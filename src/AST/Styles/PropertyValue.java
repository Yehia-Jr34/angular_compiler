package AST.Styles;

import AST.Identifier.IdentifierPath;

import java.util.ArrayList;
import java.util.List;

public class PropertyValue {
    private List<String> values = new ArrayList<>();
    private List<IdentifierPath> paths = new ArrayList<>();
    private List<CssBasicColor> colors = new ArrayList<>();

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    public List<IdentifierPath> getPaths() {
        return paths;
    }

    public void setPaths(List<IdentifierPath> paths) {
        this.paths = paths;
    }

    public List<CssBasicColor> getColors() {
        return colors;
    }

    public void setColors(List<CssBasicColor> colors) {
        this.colors = colors;
    }

    public void addValue(String value) {
        values.add(value);
    }

    public void addPath(IdentifierPath path) {
        paths.add(path);
    }

    public void addColor(CssBasicColor color) {
        colors.add(color);
    }

    @Override
    public String toString() {
        return "PropertyValue { " +
                "value = '" + values + '\'' +
                ", path = " + paths +
                ", color = " + colors +
                '}';
    }
}
