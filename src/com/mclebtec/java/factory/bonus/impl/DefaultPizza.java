package com.mclebtec.java.factory.bonus.impl;

import com.mclebtec.java.factory.bonus.PizzaBase;

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
