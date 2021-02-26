package com.mclebtec.java.factory.bonus.impl;

import com.mclebtec.java.factory.bonus.PizzaBase;

public class VegPizza implements PizzaBase {
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Veg Pizza";
    }
}
