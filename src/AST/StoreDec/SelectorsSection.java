package AST.StoreDec;

import java.util.List;

public class SelectorsSection {
    List<SelectorDec> selectors;

    public List<SelectorDec> getSelectors() {
        return selectors;
    }

    public void setSelectors(List<SelectorDec> selectors) {
        this.selectors = selectors;
    }

    public void addSelector(SelectorDec selector) {
        this.selectors.add(selector);
    }

    @Override
    public String toString() {
        return "SelectorsSection { " +
                "selectors = " + selectors +
                '}';
    }
}
