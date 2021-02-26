package com.mclebtec.java.prototype;

import com.mclebtec.java.prototype.bonus.Cell;
import com.mclebtec.java.prototype.bonus.SpecimenCache;

import java.util.Scanner;

import static com.mclebtec.java.prototype.bonus.Cell.CellProtoTypes.*;

public class ClientCell {
    public static void main(String[] args) {
        System.out.println("Welcome to the prototype designing");
        Scanner scan = new Scanner(System.in);
        SpecimenCache cache = SpecimenCache.getInstance();
        cache.loadSpecimenCache();
        Cell subject = null;
        int repeatFlag = 1;
        while (repeatFlag == 1) {
            System.out.println("Which organism you would like to culture / grow / multiply ? ");
            System.out.println("press 1 for Single Cell Org");
            System.out.println("press 2 for Amoeba ");
            System.out.println("press 3 for Bacteria ");
            int type = scan.nextInt();
            if (type == 1)
                subject = cache.getSpecimens(SINGLE_CELL_ORG);
            if (type == 2)
                subject = cache.getSpecimens(AMOEBA);
            if (type == 3)
                subject = cache.getSpecimens(BACTERIA);
            System.out.println("Culture process has started  ");
            System.out.println(" Cells are splitting/cloning and growing  ");
            for (int i = 0; i < 10; i++) {
                System.out.println(subject.split());
                System.out.println(" ...........  ........  >>>> .... ");
            }
            System.out.println("=============================");
            System.out.println("Press 1 to Repeat .... ");
            try {
                repeatFlag = scan.nextInt();
            } catch (Exception e) {
                repeatFlag = 0;
            }
        }
    }
}
