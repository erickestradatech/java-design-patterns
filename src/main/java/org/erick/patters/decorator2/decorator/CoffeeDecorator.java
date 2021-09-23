package org.erick.patters.decorator2.decorator;

import org.erick.patters.decorator2.IConfigurable;

abstract public class CoffeeDecorator implements IConfigurable {

    protected IConfigurable coffee;

    public CoffeeDecorator(IConfigurable coffee) {
        this.coffee = coffee;
    }
}
