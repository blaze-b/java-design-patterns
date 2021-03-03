package com.mclebtec.java.facade;

import com.mclebtec.java.facade.bonus.EntertainmentFacade;

import java.util.Scanner;

public class ClientBonus {
    public static void main(String[] args) {
        System.out.println("Inside the method to test the facade design pattern");
        Scanner scanner = new Scanner(System.in);
        int repeatFlag = 1;
        EntertainmentFacade facade = new EntertainmentFacade();
        while (repeatFlag == 1) {
            System.out.println("What would you like to do with your entertainment unit today ");
            System.out.println(" Press 1 for movie");
            System.out.println(" Press 2 for music");
            System.out.println(" Press 3 for game ");
            int entType = scanner.nextInt();
            System.out.println("Please enter the name ");
            String name = scanner.next();
            switch (entType) {
                case 1:
                    facade.playMovie(name);
                    break;
                case 2:
                    facade.playMusic(name);
                    break;
                case 3:
                    facade.playGame(name);
                    break;
            }
            System.out.println("Press 1 for more entertainment and 0 for EXIT .... ");
            try {
                repeatFlag = scanner.nextInt();
            } catch (Exception e) {
                repeatFlag = 0;
            }
        }
    }
}
