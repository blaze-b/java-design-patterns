package com.mclebtec.java.singleton.bonus;

public class ThreadSyncInstance {
    private ThreadSyncInstance() {
    }

    public static ThreadSyncInstance uniqueInstance = null;

    public static final synchronized ThreadSyncInstance getInstance() {
        if (uniqueInstance == null) {
            try {
                Thread.sleep(10000);
                System.out.println("Creating the instance for first and only time ");
                uniqueInstance = new ThreadSyncInstance();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return uniqueInstance;
    }

    public int stateHolder = 1;

    public void doCounting() {
        System.out.println("Each time this method is called, it current state would get incremanted by 5");
        for (int i = 1; i <= 5; i++, stateHolder++)
            System.out.println("Count is " + stateHolder);
    }
}
