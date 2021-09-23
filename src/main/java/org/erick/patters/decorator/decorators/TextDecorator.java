package org.erick.patters.decorator.decorators;

import org.erick.patters.decorator.IFormattable;

abstract public class TextDecorator implements IFormattable {

    protected IFormattable text;

    public TextDecorator(IFormattable text) {
        this.text = text;
    }
}
