package com.mclebtec.java.pattern.creational.factory.icecream.impl;

import com.mclebtec.java.pattern.creational.factory.icecream.IceCream;

public class ChocolateIceCream implements IceCream {

    String brand = "";
    Integer cost = 0;
    Integer calories = 0;

    public ChocolateIceCream(Integer cost, Integer calories) {
        this.cost = cost;
        this.calories = calories;
    }

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
