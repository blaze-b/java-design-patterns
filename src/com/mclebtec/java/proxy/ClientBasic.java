package com.mclebtec.java.proxy;

import com.mclebtec.java.proxy.basic.IPhone;
import com.mclebtec.java.proxy.basic.ProxyIphone;
import com.mclebtec.java.proxy.basic.RealIphone;

public class ClientBasic {
    public static void main(String[] args) {
        System.out.println("Proxy basic design pattern testing ");
        IPhone iPhone;
        iPhone = new ProxyIphone();
        phoneOperation(iPhone);

        iPhone = new RealIphone();
        phoneOperation(iPhone);
    }

    public static void phoneOperation(IPhone iPhone) {
        System.out.println();
        System.out.println("### Operations running on - " + iPhone.getClass().getSimpleName());
        iPhone.getColor();
        iPhone.getDimension();
        iPhone.operateDisplay();
    }
}
