package com.mclebtec.java.adaptor;

import com.mclebtec.java.adaptor.basic.EarPlug;
import com.mclebtec.java.adaptor.basic.EarPlugAdapter;
import com.mclebtec.java.adaptor.basic.phones.GooglePhone;
import com.mclebtec.java.adaptor.basic.phones.Iphone;

public class ClientBasic {

    public static void main(String[] args) {
        System.out.println("Adapter design pattern testing");
        Iphone iphone = new Iphone();
        GooglePhone googlePhone = new GooglePhone();
        EarPlug earPlug = new EarPlug();

        String soundSignal = iphone.getSoundOutput();
        earPlug.takeSoundInput(soundSignal);

        EarPlugAdapter earPlugAdapter = new EarPlugAdapter();
        soundSignal = earPlugAdapter.convertSoundSignal(googlePhone.getSoundOutput());
        earPlug.takeSoundInput(soundSignal);
    }

}
