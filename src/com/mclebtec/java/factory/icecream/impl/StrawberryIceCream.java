package com.mclebtec.java.factory.icecream.impl;

import com.mclebtec.java.factory.icecream.IceCream;

public class StrawberryIceCream implements IceCream {

    public StrawberryIceCream(Integer cost, Integer calories) {
        this.cost = cost;
        this.calories = calories;
    }

    String brand = "";
    Integer cost = 0;
    Integer calories = 0;

    public String toString() {
        return this.getClass().getSimpleName() + " with Calories: " + getCalories() + " and cost: $" + getCost();
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
    public String getIceCream() {
        return this.getClass().getSimpleName();
    }
}
