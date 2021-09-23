package org.erick.patters.decorator.decorators;

import org.erick.patters.decorator.IFormattable;

public class UnderlinedDecorator extends TextDecorator{

    public UnderlinedDecorator(IFormattable text) {
        super(text);
    }

    @Override
    public String format() {

        int lengthText = text.format().length();
        StringBuilder sb = new StringBuilder(text.format());
        sb.append("\n");
        for (int i = 0; i < lengthText; i++) {
            sb.append("_");
        }

        return sb.toString();
    }
}
