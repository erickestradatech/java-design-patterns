package org.erick.patters.factory;

import org.erick.patters.factory.product.PizzaNewYorkItalian;
import org.erick.patters.factory.product.PizzaNewYorkPepperoni;
import org.erick.patters.factory.product.PizzaNewYorkVegetarian;

public class PizzaShopNewYorkFactory extends PizzaShopZoneAbstractFactory {

    @Override
    public PizzaProduct createPizza(String kind) {

        return switch (kind) {
            case "vegetarian" -> new PizzaNewYorkVegetarian();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italian" -> new PizzaNewYorkItalian();
            default -> null;
        };
    }
}
