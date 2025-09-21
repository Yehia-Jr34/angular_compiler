package AST.Literal.Array;

import java.util.List;

public class ArrayList {
    private List<ArrayElement> elements = new java.util.ArrayList<>();

    public List<ArrayElement> getElements() {
        return elements;
    }

    public void setElements(List<ArrayElement> elements) {
        this.elements = elements;
    }

    public void addElement(ArrayElement element) {
        elements.add(element);
    }

    @Override
    public String toString() {
        return "ArrayList { " +
                "elements = " + elements +
                '}';
    }
}
