package com.mclebtec.java.pattern.creational.factory.bonus.impl;

import com.mclebtec.java.pattern.creational.factory.bonus.PizzaBase;

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
