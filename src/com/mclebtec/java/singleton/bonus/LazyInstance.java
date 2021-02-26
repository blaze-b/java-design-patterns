package com.mclebtec.java.singleton.bonus;

public class LazyInstance {

    private LazyInstance() {
    }

    public static LazyInstance lazyInstance = null;

    public static final LazyInstance getInstance() {
        if (lazyInstance == null)
            lazyInstance = new LazyInstance();
        return lazyInstance;
    }

    public int stateHolder = 1;

    public void doCounting() {
        System.out.println("Each time this method is called, it current state would get incremented by 5");
        for (int i = 1; i <= 5; i++, stateHolder++)
            System.out.println("Count is " + stateHolder);
    }
}
