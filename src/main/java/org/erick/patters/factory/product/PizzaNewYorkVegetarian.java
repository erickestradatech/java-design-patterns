package org.erick.patters.factory.product;

import org.erick.patters.factory.PizzaProduct;

public class PizzaNewYorkVegetarian extends PizzaProduct {

    public PizzaNewYorkVegetarian() {
        super();
        name = "Vegetarian Pizza New York";
        dough = "Vegan Integral dough";
        sauce = "Ketchup";
        ingredients.add("Vegan cheese");
        ingredients.add("Tomate");
        ingredients.add("Olives");
        ingredients.add("Spinach");
        ingredients.add("Aubergines");
    }

    @Override
    public void toCook() {
        System.out.println("Cooking for 25min at 150°C");
    }

    @Override
    public void toCut() {
        System.out.println("Cutting the pizza into slices square");
    }
}
