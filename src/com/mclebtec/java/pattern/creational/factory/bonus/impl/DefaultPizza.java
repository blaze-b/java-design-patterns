package com.mclebtec.java.pattern.creational.factory.bonus.impl;

import com.mclebtec.java.pattern.creational.factory.bonus.PizzaBase;

public class DefaultPizza implements PizzaBase {
    @Override
    public double getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "complementary pizza as order item is not available right now with us";
    }
}
