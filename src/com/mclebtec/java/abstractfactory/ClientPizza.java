package com.mclebtec.java.abstractfactory;

import com.mclebtec.java.abstractfactory.bonus.FactoryCreator;
import com.mclebtec.java.abstractfactory.bonus.Pizza;

import java.util.Scanner;

public class ClientPizza {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeatRunFlag = 1;
        while (repeatRunFlag == 1) {
            System.out.println("This is the Client Main Abstract Factory Pattern containing all ");
            System.out.println("What kind of Pizza would you like to have Jain Pizza or General Pizza ? ");
            System.out.println("Press Jain / general ");
            String pizzaFactory = scan.next();
            System.out.println("Enter veg for veg pizza ");
            System.out.println("Enter corn for corn pizza ");
            String pizzaType = scan.next();
            FactoryCreator pizzaStore = new FactoryCreator();
            Pizza pizza = pizzaStore.orderPizza(pizzaFactory, pizzaType);
            System.out.println("Your final order is");
            pizza.getDescription();
            System.out.println("Total cost of order is " + pizza.getCost());
            try {
                repeatRunFlag = scan.nextInt();
            } catch (Exception e) {
                repeatRunFlag = 0;
            }
        }
    }
}
