package com.mclebtec.java.bridge.basic;

public abstract class BridgeRemoteControl {

    private final ITV itv;

    public BridgeRemoteControl(ITV itv) {
        this.itv = itv;
    }

    public void turnOn() {
        itv.on();
    }

    public void turnOff() {
        itv.off();
    }

    public void setChannel(int channel) {
        itv.switchProgram(channel);
    }

    public void recordProgram() {
        System.out.println("IndependentRemoteControl use keyword to set channel.");
    }
}
