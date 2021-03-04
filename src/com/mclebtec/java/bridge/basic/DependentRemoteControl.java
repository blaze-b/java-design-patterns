package com.mclebtec.java.bridge.basic;

public class DependentRemoteControl implements ITV {
    @Override
    public void on () {
        System.out.println(" Forced to change, if TV interface changes ");
    }

    @Override
    public void off () {
        System.out.println(" Forced to change, if TV interface changes ");
    }

    @Override
    public void switchProgram (int channel) {
        System.out.println(" Forced to change, if TV interface changes ");
    }

}