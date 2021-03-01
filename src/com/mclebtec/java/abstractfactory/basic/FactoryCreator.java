package com.mclebtec.java.abstractfactory.basic;

public class FactoryCreator {
    public static AbstractItemFactory getFactory(String brand) {
        if (brand.equalsIgnoreCase("Amul"))
            return new AmulItemFactory();
        else
            return new DairyQueenItemFactory();
    }
}
