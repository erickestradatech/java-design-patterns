package org.erick.patters.decorator2;

public class Coffee implements IConfigurable{
    private float price;
    private String name;

    public Coffee(String name,float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public float getBasePrice() {
        return this.price;
    }

    @Override
    public String getIngredients() {
        return this.name;
    }
}
