package com.mclebtec.java.abstractfactory;

import com.mclebtec.java.abstractfactory.basic.AbstractItemFactory;
import com.mclebtec.java.abstractfactory.basic.FactoryCreator;
import com.mclebtec.java.abstractfactory.basic.icecream.IceCream;
import com.mclebtec.java.abstractfactory.basic.milkshakes.MilkShake;

import java.util.Scanner;

public class ClientBasic {
    public static void main(String[] args) {
        System.out.println("Inside the method to test the abstract factory design ");
        Scanner scanner = new Scanner(System.in);
        int repeatFlag = 1;
        while (repeatFlag == 1) {
            AbstractItemFactory factory = FactoryCreator.getFactory("Amul");
            IceCream iceCream = factory.createIceCream("Strawberry");
            MilkShake milkShake = factory.createMilkShake("Strawberry");
            try {
                System.out.println("Ice Cream Details = " + iceCream);
                System.out.println("Milk Shake Details = " + milkShake);
                System.out.println("Press 1 to continue");
                repeatFlag = scanner.nextInt();
            } catch (Exception e) {
                repeatFlag = 0;
            }
        }
    }
}
