package AST.HTMLAndInterpolation.HTML;

import java.util.List;

public class HTML {
    private List<HtmlContent> contents;

    public List<HtmlContent> getContents() {
        return contents;
    }

    public void setContents(List<HtmlContent> contents) {
        this.contents = contents;
    }

    public void addContent(HtmlContent content) {
        contents.add(content);
    }

    @Override
    public String toString() {
        return "HTML { " +
                "contents = " + contents +
                '}';
    }
}
