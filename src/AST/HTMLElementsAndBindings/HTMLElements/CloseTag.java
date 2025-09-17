package AST.HTMLElementsAndBindings.HTMLElements;

public class CloseTag {
    private HtmlTag htmlTag;

    public HtmlTag getHtmlTag() {
        return htmlTag;
    }

    public void setHtmlTag(HtmlTag htmlTag) {
        this.htmlTag = htmlTag;
    }

    @Override
    public String toString() {
        return "CloseTag { " +
                "htmlTag = " + htmlTag +
                '}';
    }
}
