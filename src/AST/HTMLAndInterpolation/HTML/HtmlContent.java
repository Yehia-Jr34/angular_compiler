package AST.HTMLAndInterpolation.HTML;

import AST.HTMLAndInterpolation.InterpolationValue.InterpolationValue;
import AST.HTMLElementsAndBindings.HTMLElements.HtmlElement;

public class HtmlContent {
    private String html = null;
    private HtmlElement htmlElement = null;
    private InterpolationValue interpolationValue = null;

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public HtmlElement getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(HtmlElement htmlElement) {
        this.htmlElement = htmlElement;
    }

    public InterpolationValue getInterpolationValue() {
        return interpolationValue;
    }

    public void setInterpolationValue(InterpolationValue interpolationValue) {
        this.interpolationValue = interpolationValue;
    }

    @Override
    public String toString() {
        return "HtmlContent{" +
                "html='" + (html != null ? html : "") + '\'' +
                ", htmlElement=" + (htmlElement != null ? htmlElement : "Not Defined") +
                ", interpolationValue=" + (interpolationValue != null ? interpolationValue : "Not Defined") +
                '}';
    }
}
