package org.erick.patters.factory.product;

import org.erick.patters.factory.PizzaProduct;

public class PizzaCaliforniaPepperoni extends PizzaProduct {

    public PizzaCaliforniaPepperoni() {
        super();
        name = "California pizza Pepperoni";
        dough = "Coarse stone dough";
        ingredients.add("Pepperoni");
        ingredients.add("Cheese extra Mozzarella");
        ingredients.add("Olives");
    }


    @Override
    public void toCook() {
        System.out.println("Cooking for 50 min. at 55°C");
    }

    @Override
    public void toCut() {
        System.out.println("Cutting the pizza into rectangles slices");
    }
}
