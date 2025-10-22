package AST.Styles;

import AST.HTMLElementsAndBindings.HTMLElements.HtmlTag;

import java.util.ArrayList;
import java.util.List;

public class StringArray {
    List<String> strings = new ArrayList<>();
    List<HtmlTag> tags = new ArrayList<>();
    List<CssAtt> cssAtts = new ArrayList<>();

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public List<HtmlTag> getTags() {
        return tags;
    }

    public void setTags(List<HtmlTag> tags) {
        this.tags = tags;
    }

    public List<CssAtt> getCssAtts() {
        return cssAtts;
    }

    public void setCssAtts(List<CssAtt> cssAtts) {
        this.cssAtts = cssAtts;
    }

    public void add(final String str) {
        strings.add(str);
    }

    public void add(HtmlTag tag) {
        tags.add(tag);
    }

    public void add(CssAtt cssAtt) {
        cssAtts.add(cssAtt);
    }

    @Override
    public String toString() {
        return "StringArray { " +
                "strings = " + strings +
                ", tags = " + tags +
                ", cssAtts = " + cssAtts +
                '}';
    }
}
