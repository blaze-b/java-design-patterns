package com.mclebtec.java.bridge.basic;

public class SamsungTV implements ITV {

    @Override
    public void on() {
        System.out.println(this.getClass().getSimpleName() + " ON ");
    }

    @Override
    public void off() {
        System.out.println(this.getClass().getSimpleName() + " OFF ");
    }

    @Override
    public void switchProgram(int channel) {
        System.out.println(this.getClass().getSimpleName() + " channel: " + channel);
    }
}
