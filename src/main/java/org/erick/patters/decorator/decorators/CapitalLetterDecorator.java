package org.erick.patters.decorator.decorators;

import org.erick.patters.decorator.IFormattable;

public class CapitalLetterDecorator extends TextDecorator {

    public CapitalLetterDecorator(IFormattable text) {
        super(text);
    }

    // Capitalizing
    @Override
    public String format() {
        return text.format().toUpperCase();
    }
}
