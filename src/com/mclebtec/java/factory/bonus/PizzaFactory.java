package com.mclebtec.java.factory.bonus;

import com.mclebtec.java.factory.bonus.impl.DefaultPizza;
import com.mclebtec.java.factory.bonus.impl.MexicanPizza;
import com.mclebtec.java.factory.bonus.impl.NonVegPizza;
import com.mclebtec.java.factory.bonus.impl.VegPizza;

public class PizzaFactory {
    public static PizzaBase getPizza(String type) {
        PizzaBase pizzaBase = null;
        if (type.equalsIgnoreCase("veg"))
            pizzaBase = new VegPizza();
        else if (type.equalsIgnoreCase("non-veg"))
            pizzaBase = new NonVegPizza();
        else if (type.equalsIgnoreCase("mexican"))
            return new MexicanPizza();
        else
            pizzaBase = new DefaultPizza();
        return pizzaBase;
    }
}
