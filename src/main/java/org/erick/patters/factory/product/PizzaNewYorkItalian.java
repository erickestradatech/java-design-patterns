package org.erick.patters.factory.product;

import org.erick.patters.factory.PizzaProduct;

public class PizzaNewYorkItalian extends PizzaProduct {

    public PizzaNewYorkItalian(){
        super();
        name = "Italian pizza New York";
        dough = "Thick dough";
        sauce = "Tomato sauce italian";
        ingredients.add("Mozzarella cheese");
        ingredients.add("Olives");
        ingredients.add("Ham");
        ingredients.add("Chorizo");
        ingredients.add("Mushrooms");
    }

    @Override
    public void toCook() {
        System.out.println("Cooking for 30min at 120°C");
    }

    @Override
    public void toCut() {
        System.out.println("Cutting the pizza into big triangles");
    }
}
