package org.erick.patters.factory.product;

import org.erick.patters.factory.PizzaProduct;

public class PizzaCaliforniaVegetarian extends PizzaProduct {

    public PizzaCaliforniaVegetarian(){
        super();
        name = "California Pizza Vegetarian";
        dough = "Thin dough Light";
        sauce = "Sauce BBQ Light";
        ingredients.add("Mozzarella cheese");
        ingredients.add("Olives");
        ingredients.add("Spinach");
        ingredients.add("Onion");
        ingredients.add("eggplant");
    }

    @Override
    public void toCook() {
        System.out.println("Cooking for 20min at 180°C");
    }

    @Override
    public void toCut() {
        System.out.println("Cutting the pizza into triangles slices");
    }
}
