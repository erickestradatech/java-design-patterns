package org.erick.patters.decorator2.decorator;

import org.erick.patters.decorator2.IConfigurable;

public class WithChocolateDecorator extends CoffeeDecorator{

    public WithChocolateDecorator(IConfigurable coffee) {
        super(coffee);
    }

    @Override
    public float getBasePrice() {
        return coffee.getBasePrice()+5f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", Chocolate";
    }
}
