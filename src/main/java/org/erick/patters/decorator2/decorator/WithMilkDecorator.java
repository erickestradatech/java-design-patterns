package org.erick.patters.decorator2.decorator;

import org.erick.patters.decorator2.IConfigurable;

public class WithMilkDecorator extends CoffeeDecorator{

    public WithMilkDecorator(IConfigurable coffee) {
        super(coffee);
    }

    @Override
    public float getBasePrice() {
        return coffee.getBasePrice()+3.7f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients()+ ", Milk";
    }
}
