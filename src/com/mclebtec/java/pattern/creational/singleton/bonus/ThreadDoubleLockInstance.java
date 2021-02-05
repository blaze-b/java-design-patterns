package com.mclebtec.java.pattern.creational.singleton.bonus;

public class ThreadDoubleLockInstance {

    private ThreadDoubleLockInstance() {
    }

    public static volatile ThreadDoubleLockInstance threadDoubleLockInstance = null;

    public static final ThreadDoubleLockInstance getInstance() {
        if (threadDoubleLockInstance == null) {
            synchronized (ThreadDoubleLockInstance.class) {
                try {
                    Thread.sleep(10000);
                    if (threadDoubleLockInstance == null) {
                        System.out.println("Creating the instance for first and only time");
                        threadDoubleLockInstance = new ThreadDoubleLockInstance();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return threadDoubleLockInstance;
    }

    public int stateHolder = 1;

    public void doCounting() {
        System.out.println("Each time this method is called, it current state would get " +
                "incremented by 5 with thread name = " + Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++, stateHolder++)
            System.out.println("Count is " + stateHolder);
    }
}
