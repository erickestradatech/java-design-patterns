package org.erick.patters.factory.product;

import org.erick.patters.factory.PizzaProduct;

public class PizzaNewYorkPepperoni extends PizzaProduct {

    public PizzaNewYorkPepperoni() {
        super();
        name = "Pizza Pepperoni New York";
        dough = "Thin dough to stone";
        sauce = "Ketchup";
        ingredients.add("Mozzarella cheese");
        ingredients.add("Pepperoni extra");
        ingredients.add("Olives");
    }

    @Override
    public void toCook() {
        System.out.println("Cooking for 40min at 90°C");
    }

    @Override
    public void toCut() {
        System.out.println("Cutting the pizza into triangles");
    }
}
