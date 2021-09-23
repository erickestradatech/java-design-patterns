package org.erick.patters.factory.product;

import org.erick.patters.factory.PizzaProduct;

public class PizzaCaliforniaCheese extends PizzaProduct {

    public PizzaCaliforniaCheese() {
        super();
        name = "California Pizza cheese";
        dough = "Thin stone dough";
        sauce = "Ketchup";
        ingredients.add("Cheese extra Mozzarella");
        ingredients.add("Onion");
        ingredients.add("Blue cheese");
    }


    @Override
    public void toCook() {
        System.out.println("Cooking for 35min at 100°C");
    }

    @Override
    public void toCut() {
        System.out.println("Cutting the pizza into triangles slices");
    }
}
