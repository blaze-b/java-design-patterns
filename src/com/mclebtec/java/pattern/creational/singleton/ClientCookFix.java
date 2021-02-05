package com.mclebtec.java.pattern.creational.singleton;


import com.mclebtec.java.pattern.creational.singleton.fix.Cook;

public class ClientCookFix {

    public static void main(String[] args) {
        Cook cook1 = Cook.getInstance();
        Cook cook2 = Cook.getInstance();
        Cook cook3 = Cook.getInstance();
        cook1.makeBroth();
        System.out.println(cook1.isSaltAdded());
        cook2.makeBroth();
        System.out.println(cook2.isSaltAdded());
        cook3.makeBroth();
        System.out.println(cook3.isSaltAdded());
    }
}
