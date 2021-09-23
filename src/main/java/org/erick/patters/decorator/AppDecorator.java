package org.erick.patters.decorator;

import org.erick.patters.decorator.decorators.CapitalLetterDecorator;
import org.erick.patters.decorator.decorators.ReverseDecorator;
import org.erick.patters.decorator.decorators.UnderlinedDecorator;

public class AppDecorator {
    public static void main(String[] args) {

        IFormattable text = new Text("Hello how are you Erick!");

        CapitalLetterDecorator capitalLetter = new CapitalLetterDecorator(text);
        ReverseDecorator reverse = new ReverseDecorator(capitalLetter);
        UnderlinedDecorator underlined = new UnderlinedDecorator(reverse);

        System.out.println(underlined.format());
    }
}
