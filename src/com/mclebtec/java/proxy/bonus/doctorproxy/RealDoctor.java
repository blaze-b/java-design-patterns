package com.mclebtec.java.proxy.bonus.doctorproxy;

public class RealDoctor extends Doctor {

    @Override
    public void doOperationAndSurgery() {
        System.out.println(this.getClass().getSimpleName() + " is doing the operation");
    }
}
