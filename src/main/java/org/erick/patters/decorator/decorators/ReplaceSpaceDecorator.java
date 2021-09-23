package org.erick.patters.decorator.decorators;

import org.erick.patters.decorator.IFormattable;
import org.erick.patters.decorator.Text;

public class ReplaceSpaceDecorator extends TextDecorator {

    public ReplaceSpaceDecorator(IFormattable text) {
        super(text);
    }

    @Override
    public String format() {
        return text.format().replace(" ","_");
    }
}
