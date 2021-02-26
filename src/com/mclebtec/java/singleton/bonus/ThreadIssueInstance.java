package com.mclebtec.java.singleton.bonus;

public class ThreadIssueInstance {

    private ThreadIssueInstance() {
    }

    public static ThreadIssueInstance threadIssueInstance = null;

    public static final ThreadIssueInstance getInstance() {
        if (threadIssueInstance == null) {
            try {
                Thread.sleep(1000);
                System.out.println("Creating the instance of the class");
                threadIssueInstance = new ThreadIssueInstance();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return threadIssueInstance;
    }

    public int stateHolder = 1;

    public void doCounting() {
        System.out.println("Each time this method is called, it current state would get incremented by 5");
        for (int i = 1; i <= 5; i++, stateHolder++)
            System.out.println("Count is " + stateHolder);
    }
}
