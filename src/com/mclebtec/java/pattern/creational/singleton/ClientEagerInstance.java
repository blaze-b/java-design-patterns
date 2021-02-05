package com.mclebtec.java.pattern.creational.singleton;

import com.mclebtec.java.pattern.creational.singleton.bonus.EagerInstance;

import java.util.Scanner;

public class ClientEagerInstance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeatFlag = 1;
        while (repeatFlag == 1) {
            System.out.println("This is the Client Main Singleton eager instance ");
            EagerInstance instance = EagerInstance.eagerInstance;
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
