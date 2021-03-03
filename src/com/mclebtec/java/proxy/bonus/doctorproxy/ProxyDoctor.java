package com.mclebtec.java.proxy.bonus.doctorproxy;

public class ProxyDoctor extends Doctor {

    RealDoctor realDoctor = null;


    public void doGeneralCheckup() {
        if (realDoctor != null)
            realDoctor.doGeneralCheckUp();
        else
            new HospitalService().callNurse();
    }

    @Override
    public void doOperationAndSurgery() {
        System.out.println("Invoking the real doctor for operation");
        realDoctor = new RealDoctor();
        realDoctor.doOperationAndSurgery();
    }
}
