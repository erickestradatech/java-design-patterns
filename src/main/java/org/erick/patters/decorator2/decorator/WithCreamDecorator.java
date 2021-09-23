package org.erick.patters.decorator2.decorator;

import org.erick.patters.decorator2.IConfigurable;

public class WithCreamDecorator extends CoffeeDecorator{

    public WithCreamDecorator(IConfigurable coffee) {
        super(coffee);
    }

    @Override
    public float getBasePrice() {
        return coffee.getBasePrice() + 2.5f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients()+", Cream";
    }
}
