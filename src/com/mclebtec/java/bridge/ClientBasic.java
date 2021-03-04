package com.mclebtec.java.bridge;

import com.mclebtec.java.bridge.basic.DependentRemoteControl;
import com.mclebtec.java.bridge.basic.ITV;
import com.mclebtec.java.bridge.basic.IndependentRemoteControl;
import com.mclebtec.java.bridge.basic.SonyTV;

public class ClientBasic {
    public static void main(String[] args) {
        System.out.println("Inside the method to test the bridge design pattern");
        ITV itv = new SonyTV();
//      Independent Design
        IndependentRemoteControl remoteOne = new IndependentRemoteControl(itv);
        remoteOne.turnOn();
        remoteOne.setChannel(7);
        remoteOne.setChannelKeyboard(8);
        remoteOne.turnOff();
        remoteOne.recordProgram();
//        Dependent design
        DependentRemoteControl remoteTwo = new DependentRemoteControl();
        remoteTwo.on();
        remoteTwo.off();
        remoteTwo.switchProgram(7);
    }
}
