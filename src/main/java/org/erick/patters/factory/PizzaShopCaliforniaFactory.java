package org.erick.patters.factory;

import org.erick.patters.factory.product.PizzaCaliforniaCheese;
import org.erick.patters.factory.product.PizzaCaliforniaPepperoni;
import org.erick.patters.factory.product.PizzaCaliforniaVegetarian;

public class PizzaShopCaliforniaFactory extends PizzaShopZoneAbstractFactory {

    @Override
    public PizzaProduct createPizza(String kind) {

        return switch (kind) {
            case "cheese" -> new PizzaCaliforniaCheese();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "vegetarian" -> new PizzaCaliforniaVegetarian();
            default -> null;
        };
    }
}
