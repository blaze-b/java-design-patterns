package com.mclebtec.java.pattern.creational.singleton.bonus;

public class EagerInstance {
    private EagerInstance(){
    }
    public static final EagerInstance eagerInstance = new EagerInstance();

    public int stateHolder = 1;

    public void doCounting() {
        System.out.println("Each time this method is called, it current state would get incremented by 5");
        for (int i = 1; i <= 5; i++, stateHolder++)
            System.out.println("Count is " + stateHolder);
    }

}
