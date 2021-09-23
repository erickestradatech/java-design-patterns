package org.erick.patters.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProduct {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> ingredients;

    public PizzaProduct() {
        this.ingredients = new ArrayList<>();
    }

    public void toPrepare(){
        System.out.println("Preparing "+name);
        System.out.println("Selecting the sauce "+dough);
        System.out.println("Adding sauce "+sauce);
        System.out.println("Adding ingredients: ");
        this.ingredients.forEach(System.out::println);
    }

    public String getName() {
        return name;
    }

    public abstract void toCook();

    public abstract void toCut();

    public void toPackage(){
        System.out.println("Putting the pizza in a box...");
    }

    @Override
    public String toString() {
        return "PizzaProduct{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
