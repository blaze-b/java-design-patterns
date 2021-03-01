package com.mclebtec.java.abstractfactory.bonus;

public class GeneralPizzaFactory extends AbstractPizzaFactory {

    @Override
    public Pizza createPizzaType(String type) {
        Pizza pizza = null;
        if (type.equalsIgnoreCase("Corn"))
            pizza = new CornPizza();
        else if (type.equalsIgnoreCase("Veg"))
            pizza = new VegPizza();
        return pizza;
    }
}
