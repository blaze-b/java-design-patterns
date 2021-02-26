package com.mclebtec.java.factory;

import com.mclebtec.java.factory.bonus.PizzaBase;
import com.mclebtec.java.factory.bonus.PizzaFactory;

import java.util.Scanner;

public class ClientPizza {
    public static void main(String[] args) {
        System.out.println("Inside the pizza client method");
        Scanner scanner = new Scanner(System.in);
        int repeatFlag = 1;
        while (repeatFlag == 1) {
            System.out.println("Please enter the choice");
            String choice = scanner.next();
            PizzaBase pizza = PizzaFactory.getPizza(choice);
            try {
                System.out.println("Current Pizza Details with name =" + pizza.getClass().getSimpleName());
                System.out.println("Current Pizza Details with cost =" + pizza.getCost());
                System.out.println("Current Pizza Details with description =" + pizza.getDescription());
                System.out.println("Press 1 to continue");
                repeatFlag = scanner.nextInt();
            } catch (Exception e) {
                repeatFlag = 0;
            }
        }
    }
}
