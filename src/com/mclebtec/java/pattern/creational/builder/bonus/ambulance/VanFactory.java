package com.mclebtec.java.pattern.creational.builder.bonus.ambulance;

public class VanFactory {
    Van createVan(int numberOfWheel) {
        Van van = new Van();
        van.setNoOfWheels(numberOfWheel);
        return van;
    }

    Van getVan(int numberOfWheel) {
        switch (numberOfWheel) {
            case 1:
                return new FourWheelerVan();
            case 2:
                return new SixWheelerVan();
            default:
                return new EightWheelerVan();
        }
    }
}
