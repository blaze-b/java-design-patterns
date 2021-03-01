package com.mclebtec.java.abstractfactory.basic.icecream;

public class ChocolateIceCream implements IceCream {

    String brand = "";
    Integer cost = 0;
    Integer calories = 0;

    public ChocolateIceCream(String brand, Integer cost, Integer calories) {
        this.brand = brand;
        this.cost = cost;
        this.calories = calories;
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

    public String toString() {
        return this.getClass().getSimpleName() + "of Brand " + brand +
                " with Calories: " + getCalories() + " and cost: $" + getCost();
    }
}
