package org.erick.patters.decorator2;

import org.erick.patters.decorator2.decorator.WithChocolateDecorator;
import org.erick.patters.decorator2.decorator.WithCreamDecorator;
import org.erick.patters.decorator2.decorator.WithMilkDecorator;

public class AppCoffeeDecorator {
    public static void main(String[] args) {

        IConfigurable coffee = new Coffee("Mocha coffee", 7);
        WithCreamDecorator withCream = new WithCreamDecorator(coffee);
        WithMilkDecorator withMilk = new WithMilkDecorator(withCream);
        WithChocolateDecorator withChocolate = new WithChocolateDecorator(withMilk);

        System.out.println("The price of Mocha coffee is: " + withChocolate.getBasePrice());
        System.out.println("The ingredients: " + withChocolate.getIngredients());

        System.out.println("=======================================");

        IConfigurable cappuccino = new Coffee("Cappuccino",4);
        withCream = new WithCreamDecorator(cappuccino);
        withMilk = new WithMilkDecorator(withCream);
        System.out.println("The price of Cappuccino is: "+withMilk.getBasePrice());
        System.out.println("The ingredients: "+withMilk.getIngredients());

        System.out.println("=======================================");

        IConfigurable espresso = new Coffee("Espresso Coffee",3);
        System.out.println("The price of Espresso coffe is: "+espresso.getBasePrice());
        System.out.println("The ingredients of Espresso coffee is: "+espresso.getIngredients());

    }
}
