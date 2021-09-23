package org.erick.patters.factory;

abstract public class PizzaShopZoneAbstractFactory {

    public PizzaProduct orderPizza(String kind) {
        PizzaProduct pizza = createPizza(kind);
        System.out.println("Making the pizza " + pizza.getName() + "-----");
        pizza.toPrepare();
        pizza.toCut();
        pizza.toPackage();

        return pizza;
    }

    abstract PizzaProduct createPizza(String kind);
}
