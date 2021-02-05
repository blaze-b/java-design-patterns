package com.mclebtec.java.pattern.creational.singleton;

import com.mclebtec.java.pattern.creational.singleton.bonus.ThreadSyncInstance;

import java.util.Scanner;

public class ClientThreadSyncInstance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeatRunFlag = 1;
        while (repeatRunFlag == 1) {
            System.out.println("This is the Client Main Singleton Thread issue, there is a fair chance of multiple instiances creation by multiple threads  ");
            Thread thread1 = new Thread(() -> {
                System.out.println("Thread1 Running");
                ThreadSyncInstance.getInstance().doCounting();
            });
            thread1.setName("thread 1");
            thread1.start();
            Thread thread2 = new Thread(() -> {
                System.out.println("Thread2 Running");
                ThreadSyncInstance.getInstance().doCounting();
            });
            thread2.setName("thread 2");
            thread2.start();
            Thread thread3 = new Thread(() -> {
                System.out.println("Thread3 Running");
                ThreadSyncInstance.getInstance().doCounting();
            });
            thread3.setName("thread 3");
            thread3.start();
            System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
            try {
                repeatRunFlag = scanner.nextInt();
            } catch (Exception e) {
                repeatRunFlag = 0;
            }
        }
    }
}
