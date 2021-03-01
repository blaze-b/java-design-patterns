package com.mclebtec.java.abstractfactory.bonus;

public interface Pizza {

    void getDescription();

    double getCost();

}

class VegPizza implements Pizza {

    @Override
    public void getDescription() {
        System.out.println("Veg pizza from the general factory");
    }

    @Override
    public double getCost() {
        return 10.1;
    }
}

class JainVegPizza implements Pizza {
    @Override
    public void getDescription() {
        System.out.println(" Veg Pizza from Jain Factory");
    }

    @Override
    public double getCost() {
        return 11.1;
    }
}

class CornPizza implements Pizza {
    @Override
    public void getDescription() {
        System.out.println(" Corn Pizza from general Factory");
    }

    @Override
    public double getCost() {
        return 20.1;
    }
}

class JainCornPizza implements Pizza {
    @Override
    public void getDescription() {
        System.out.println(" Corn Pizza from Jain Factory");
    }

    @Override
    public double getCost() {
        return 22.1;
    }
}