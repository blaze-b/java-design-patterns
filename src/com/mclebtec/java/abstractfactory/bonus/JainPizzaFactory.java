package com.mclebtec.java.abstractfactory.bonus;

public class JainPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizzaType(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("Corn"))
            pizza = new JainCornPizza();
        else if (type.equalsIgnoreCase("Veg"))
            pizza = new JainVegPizza();
        return pizza;
    }
}
