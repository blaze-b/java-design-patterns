package com.mclebtec.java.factory.bonus.impl;

import com.mclebtec.java.factory.bonus.PizzaBase;

public class NonVegPizza implements PizzaBase {
    @Override
    public double getCost() {
        return 11;
    }

    @Override
    public String getDescription() {
        return "Non-Veg Pizza";
    }
}
