package com.mclebtec.java.singleton.issue;

/**
 * A normal class
 */
public class Cook {
    public Cook() {
    }

    boolean saltAdded = false;

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
