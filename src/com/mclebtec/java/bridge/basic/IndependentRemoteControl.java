package com.mclebtec.java.bridge.basic;

public class IndependentRemoteControl extends BridgeRemoteControl{

    public IndependentRemoteControl(ITV itv) {
        super(itv);
    }

    public void setChannelKeyboard (int channel) {
        setChannel(channel);
        System.out.println("IndependentRemoteControl use keyword to set channel.");
    }
}
