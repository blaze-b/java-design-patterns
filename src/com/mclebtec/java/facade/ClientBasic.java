package com.mclebtec.java.facade;

import com.mclebtec.java.facade.basic.MasterRemoteFacade;

import java.util.Scanner;

public class ClientBasic {
    public static void main(String[] args) {
        System.out.println("Inside the method to test the facade pattern design");
        Scanner scanner = new Scanner(System.in);
        int repeatFlag = 1;
        while (repeatFlag == 1) {
            MasterRemoteFacade masterRemoteFacade = new MasterRemoteFacade();
            System.out.println("Enter the device to be turned on");
            String device = scanner.next();
            masterRemoteFacade.turnOn(device);
            masterRemoteFacade.turnOFF(device);
            try {
                System.out.println("Do you want to add more tasks before provisioning 1-yes / 0-No and " +
                        "trigger provisioning ");
                repeatFlag = scanner.nextInt();
            } catch (Exception e) {
                repeatFlag = 0;
            }
        }

    }
}
