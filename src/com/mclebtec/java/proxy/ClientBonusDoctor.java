package com.mclebtec.java.proxy;

import com.mclebtec.java.proxy.bonus.doctorproxy.Doctor;
import com.mclebtec.java.proxy.bonus.doctorproxy.ProxyDoctor;

import java.util.Scanner;

public class ClientBonusDoctor {
    public static void main(String[] args) {
        Doctor doctor = new ProxyDoctor();
        Scanner scanner = new Scanner(System.in);
        int repeatFlag = 1;
        while (repeatFlag == 1) {
            System.out.println("What do you want from doctor ");
            System.out.println(" Press 1 for general checkup");
            System.out.println(" Press 2 for Surgery and operation ");
            System.out.println(" Press 3 for testing report and surgery ");
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    doctor.doGeneralCheckUp();
                    break;
                case 2:
                    doctor.doOperationAndSurgery();
                    break;
                case 3:
                    doctor.provideSummaryAndReport();
                    break;
                default:
                    System.out.println("No Details are available");
            }
            System.out.println("=============================");
            System.out.println("Press 1 for further treatment and 0 for EXIT .... ");
            try {
                repeatFlag = scanner.nextInt();
            } catch (Exception e) {
                repeatFlag = 0;
            }
        }
    }
}
