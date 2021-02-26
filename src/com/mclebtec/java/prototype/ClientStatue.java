package com.mclebtec.java.prototype;

import com.mclebtec.java.prototype.statues.JesusStatues;
import com.mclebtec.java.prototype.statues.StatueMold;

import java.util.Scanner;

public class ClientStatue {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("### Statue creation by Prototype design pattern ");
        System.out.println("How many Statue you want to create based on Mold / prototype ?");
        Scanner scan = new Scanner(System.in);
        int quantity = scan.nextInt();
        StatueMold statueMold = new JesusStatues();
        for (int i = 0; i < quantity; i++) {
            statueMold.createStatue();
        }
    }
}
