package com.mclebtec.java.pattern.creational.factory;

import com.mclebtec.java.pattern.creational.factory.icecream.IceCream;

import java.util.Scanner;

import static com.mclebtec.java.pattern.creational.factory.icecream.IceCreamFactory.createIceCream;

public class ClientIceCream {
    public static void main(String[] args) {
        System.out.println("Welcome to the ice cream factory project");
        Scanner scanner = new Scanner(System.in);
        int repeatFlag = 1;
        while (repeatFlag == 1) {
            System.out.println("Inside the method to test the client main method for the ice cream factory");
            System.out.println("Enter the ice cream choice");
            String choice = scanner.next();
            IceCream iceCream = createIceCream(choice);
            try {
                System.out.println("Current ice cream details = " + iceCream.toString());
                repeatFlag = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("The current ice cream choice is not available");
                repeatFlag = 0;
            }
        }
    }
}
