package AST.Styles;

import java.util.ArrayList;
import java.util.List;

public class Styles {
    private String style = null;
    private List<StringArray> stringArray = new ArrayList<>();

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public List<StringArray> getStringArray() {
        return stringArray;
    }

    public void setStringArray(List<StringArray> stringArray) {
        this.stringArray = stringArray;
    }

    public void add(StringArray str) {
        stringArray.add(str);
    }

    @Override
    public String toString() {
        if (!stringArray.isEmpty()) {
            return "Styles { " +
                    "stringArray = " + stringArray +
                    '}';
        } else {
            return "Styles { " +
                    "style = '" + style + '\'' +
                    '}';
        }
    }
}
