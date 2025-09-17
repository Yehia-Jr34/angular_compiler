package AST.HTMLElementsAndBindings.HTMLElements;

import AST.HTMLAndInterpolation.HTML.HtmlContent;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    private SelfClosingTag selfClosingTag = null;
    private OpenTag openTag = null;
    private CloseTag closeTag = null;
    private List<HtmlContent> htmlContent = new ArrayList<>();

    public SelfClosingTag getSelfClosingTag() {
        return selfClosingTag;
    }

    public void setSelfClosingTag(SelfClosingTag selfClosingTag) {
        this.selfClosingTag = selfClosingTag;
    }

    public OpenTag getOpenTag() {
        return openTag;
    }

    public void setOpenTag(OpenTag openTag) {
        this.openTag = openTag;
    }

    public CloseTag getCloseTag() {
        return closeTag;
    }

    public void setCloseTag(CloseTag closeTag) {
        this.closeTag = closeTag;
    }

    public List<HtmlContent> getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(List<HtmlContent> htmlContent) {
        this.htmlContent = htmlContent;
    }

    public void addHtmlContent(HtmlContent htmlContent) {
        this.htmlContent.add(htmlContent);
    }

    @Override
    public String toString() {
        if (selfClosingTag != null) {
            return "HtmlElement { " +
                    "selfClosingTag = " + selfClosingTag +
                    '}';
        } else {
            return "HtmlElement { " +
                    "openTag = " + openTag +
                    ", closeTag = " + closeTag +
                    ", htmlContent = " + htmlContent +
                    '}';
        }
    }
}
