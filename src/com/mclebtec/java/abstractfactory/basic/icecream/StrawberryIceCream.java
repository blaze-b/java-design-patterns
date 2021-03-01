package com.mclebtec.java.abstractfactory.basic.icecream;

public class StrawberryIceCream implements IceCream {

    String brand;
    Integer cost;
    Integer calories;

    public StrawberryIceCream(String brand, Integer cost, Integer calories) {
        this.brand = brand;
        this.cost = cost;
        this.calories = calories;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "of Brand " + brand +
                " with Calories: " + getCalories() + " and cost: $" + getCost();
    }

    @Override
    public Integer getCalories() {
        return calories;
    }

    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public String getBrand() {
        return brand;
    }
}
