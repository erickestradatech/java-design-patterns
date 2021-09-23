package org.erick.patters.decorator;

public class Text implements IFormattable {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String format() {
        return getText();
    }
}
