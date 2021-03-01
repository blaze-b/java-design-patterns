package com.mclebtec.java.adaptor;

import com.mclebtec.java.adaptor.bonus.AmazonCloudAdapter;
import com.mclebtec.java.adaptor.bonus.AzureCloudAdapter;
import com.mclebtec.java.adaptor.bonus.ClientBrokerInterface;
import com.mclebtec.java.adaptor.bonus.GoogleCloudAdapter;

import java.util.Scanner;

public class ClientBonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int repeatRunFlag = 1;
        System.out.println("Inside the adaptor design pattern");
        System.out.println("Please pick for any of the service providers");
        System.out.println(" Press 1 for Amazon Cloud");
        System.out.println(" Press 2 for Azure Cloud");
        System.out.println(" Press 3 for Google Cloud ");
        int vdcType = scan.nextInt();
        ClientBrokerInterface broker;
        switch (vdcType) {
            case 2:
                broker = new AzureCloudAdapter();
                break;
            case 3:
                broker = new GoogleCloudAdapter();
                break;
            default:
                broker = new AmazonCloudAdapter();
        }
        while (repeatRunFlag == 1) {
            System.out.println(" What do you want to do ");
            System.out.println(" 1. Start a VM ");
            System.out.println(" 2. Stop a VM ");
            System.out.println(" 3. Reboot a VM");
            int taskType = scan.nextInt();
            switch (taskType) {
                case 1:
                    broker.start("");
                    break;
                case 2:
                    broker.stop("");
                    break;
                case 3:
                    broker.restart("");
                    break;
            }
            System.out.println("Do you want to add more tasks before provisioning 1-yes / 0-No and trigger provisioning ");
            try {
                repeatRunFlag = scan.nextInt();
            } catch (Exception e) {
                repeatRunFlag = 0;
            }
        }
    }
}
