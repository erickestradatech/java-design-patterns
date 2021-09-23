package org.erick.patters.decorator.decorators;

import org.erick.patters.decorator.IFormattable;

public class ReverseDecorator extends TextDecorator{

    public ReverseDecorator(IFormattable text) {
        super(text);
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder(text.format());
        return sb.reverse().toString();
    }
}
