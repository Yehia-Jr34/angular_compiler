package AST.HTMLElementsAndBindings.HTMLElements;

public class TextContent {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextContent { " +
                "text = '" + text + '\'' +
                '}';
    }
}
