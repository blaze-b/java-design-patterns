package com.mclebtec.java.abstractfactory.bonus;

public class FactoryCreator {

    public Pizza orderPizza(String pizzaFactory, String pizzaType) {
        AbstractPizzaFactory factory = getPizzaFactory(pizzaFactory);
        Pizza pizza = factory.createPizzaType(pizzaType);
        System.out.println("Pizza details = " + pizza);
        return pizza;
    }

    private AbstractPizzaFactory getPizzaFactory(String pizzaFactory) {
        if (pizzaFactory.equalsIgnoreCase("Jain"))
            return new JainPizzaFactory();
        return new GeneralPizzaFactory();
    }
}
