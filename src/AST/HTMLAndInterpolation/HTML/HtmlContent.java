package AST.HTMLAndInterpolation.HTML;

import AST.HTMLAndInterpolation.InterpolationValue.Interpolation;
import AST.HTMLAndInterpolation.InterpolationValue.InterpolationValue;
import AST.HTMLElementsAndBindings.HTMLElements.HtmlElement;
import AST.HTMLElementsAndBindings.HTMLElements.TextContent;

public class HtmlContent {
    private String html = null;
    private HtmlElement htmlElement = null;
    private Interpolation interpolationValue = null;
    private String textContent = null;

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

    public Interpolation getInterpolationValue() {
        return interpolationValue;
    }

    public void setInterpolationValue(Interpolation interpolationValue) {
        this.interpolationValue = interpolationValue;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @Override
    public String toString() {
        return "HtmlContent{" +
                "html='" + (html != null ? html : "") + '\'' +
                ", htmlElement=" + (htmlElement != null ? htmlElement : "Not Defined") +
                ", interpolationValue=" + (interpolationValue != null ? interpolationValue : "Not Defined") +
                ", textContent=" + (textContent != null ? textContent : "Not Defined") +
                '}';
    }
}
