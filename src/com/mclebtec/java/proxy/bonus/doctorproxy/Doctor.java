package com.mclebtec.java.proxy.bonus.doctorproxy;

public abstract class Doctor {

    public void doGeneralCheckUp() {
        new HospitalService().callNurse();
    }

    public abstract void doOperationAndSurgery();

    public void provideSummaryAndReport() {
        new HospitalService().generateSummaryReport();
    }
}


