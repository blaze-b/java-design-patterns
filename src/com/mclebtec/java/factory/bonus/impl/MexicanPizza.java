package com.mclebtec.java.factory.bonus.impl;

import com.mclebtec.java.factory.bonus.PizzaBase;

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
