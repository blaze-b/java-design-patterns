package com.mclebtec.java.singleton;

import java.util.Scanner;

import com.mclebtec.java.singleton.bonus.LazyInstance;

public class ClientLazyInstance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeatFlag = 1;
        while (repeatFlag == 1) {
            System.out.println("This is the Client Main Singleton Lazy instance, that means the instance would be created on need basis ");
            LazyInstance instance = LazyInstance.getInstance();
            instance.doCounting();
            instance.doCounting();
            instance.doCounting();
            System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
            try {
                repeatFlag = scanner.nextInt();
            } catch (Exception e) {
                repeatFlag = 0;
            }
        }
    }
}
