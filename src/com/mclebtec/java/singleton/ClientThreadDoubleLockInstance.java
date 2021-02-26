package com.mclebtec.java.singleton;

import com.mclebtec.java.singleton.bonus.ThreadDoubleLockInstance;

import java.util.Scanner;

public class ClientThreadDoubleLockInstance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeatFlag = 1;
        while (repeatFlag == 1){
            System.out.println("This is the Client Main Singleton Thread issue, there is a fair chance of multiple " +
                    "instances creation by multiple threads");
            Thread thread1 = new Thread(() -> {
                System.out.println("Thread 1 running");
                ThreadDoubleLockInstance.getInstance().doCounting();
            });
            thread1.setName("thread-1");
            thread1.start();
            Thread thread2 = new Thread(() -> {
                System.out.println("Thread 2 running");
                ThreadDoubleLockInstance.getInstance().doCounting();
            });
            thread2.setName("thread-2");
            thread2.start();
            Thread thread3 = new Thread(() -> {
                System.out.println("Thread 3 running");
                ThreadDoubleLockInstance.getInstance().doCounting();
            });
            thread3.setName("thread-3");
            thread3.start();
            System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT");
            try {
                repeatFlag = scanner.nextInt();
            } catch (Exception e) {
                repeatFlag = 0;
            }
        }

    }
}
