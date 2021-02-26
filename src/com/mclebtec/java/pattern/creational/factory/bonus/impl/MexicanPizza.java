package com.mclebtec.java.pattern.creational.factory.bonus.impl;

import com.mclebtec.java.pattern.creational.factory.bonus.PizzaBase;

public class MexicanPizza implements PizzaBase {
    @Override
    public double getCost() {
        return 13;
    }

    @Override
    public String getDescription() {
        return "Mexican Pizza";
    }
}
