package AST.HTMLElementsAndBindings.HTMLElements;

public class HtmlTag {
    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "HtmlTag { " +
                "tag = '" + tag + '\'' +
                '}';
    }
}
