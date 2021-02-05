package com.mclebtec.java.pattern.creational.singleton.fix;

/**
 * A singleton class
 */
public class Cook {
    //A private constructor
    private Cook() {
    }
    //An instance method
    private static Cook uniqueInstance = null;
    public static Cook getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new Cook();
        return uniqueInstance;
    }

    private boolean saltAdded = false;

    public boolean isSaltAdded() {
        return saltAdded;
    }

    public void makeBroth() {
        if (!saltAdded) {
            System.out.println("Adding Salt");
            saltAdded = true;
        }
    }
}
