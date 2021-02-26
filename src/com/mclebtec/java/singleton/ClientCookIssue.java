package com.mclebtec.java.singleton;

import com.mclebtec.java.singleton.issue.Cook;

public class ClientCookIssue {

    public static void main(String[] args) {
        Cook cook1 = new Cook();
        Cook cook2 = new Cook();
        Cook cook3 = new Cook();

        cook1.makeBroth();
        System.out.println(cook1.isSaltAdded());
        cook2.makeBroth();
        System.out.println(cook2.isSaltAdded());
        cook3.makeBroth();
        System.out.println(cook3.isSaltAdded());
    }
}
