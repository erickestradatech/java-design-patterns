package org.erick.patters.factory.example;

import org.erick.patters.factory.PizzaProduct;
import org.erick.patters.factory.PizzaShopCaliforniaFactory;
import org.erick.patters.factory.PizzaShopNewYorkFactory;
import org.erick.patters.factory.PizzaShopZoneAbstractFactory;

public class ExampleFactory {
    public static void main(String[] args) {

        PizzaShopZoneAbstractFactory ny = new PizzaShopNewYorkFactory();
        PizzaShopZoneAbstractFactory california = new PizzaShopCaliforniaFactory();

        PizzaProduct pizza = california.orderPizza("cheese");
        System.out.println("Bruce orders the pizza "+pizza.getName());

        pizza = ny.orderPizza("pepperoni");
        System.out.println("Andres orders the pizza "+pizza.getName());

        pizza = california.orderPizza("vegetarian");
        System.out.println("James orders "+pizza.getName());

        pizza = ny.orderPizza("vegetarian");
        System.out.println("Linus orders the pizza "+pizza.getName());

        pizza = california.orderPizza("pepperoni");
        System.out.println("John orders the pizza "+pizza.getName());

        System.out.println("pizza = " + pizza);
    }
}
