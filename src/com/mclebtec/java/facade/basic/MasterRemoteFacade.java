package com.mclebtec.java.facade.basic;

public class MasterRemoteFacade {

    private final SetTopBoxRemote setTopBoxRemote;
    private final SoundSystemRemote soundSystemRemote;
    private final TvRemote tvRemote;

    public MasterRemoteFacade() {
        tvRemote = new TvRemote();
        setTopBoxRemote = new SetTopBoxRemote();
        soundSystemRemote = new SoundSystemRemote();
    }

    public void turnOn(String device) {
        if (device.equalsIgnoreCase("TV"))
            tvRemote.turnOn();
        if (device.equalsIgnoreCase("SOUND-SYSTEM"))
            soundSystemRemote.turnOn();
        if (device.equalsIgnoreCase("SET-UP-BOX"))
            setTopBoxRemote.turnOn();
    }

    public void turnOFF(String device) {
        if (device.equalsIgnoreCase("TV"))
            tvRemote.turnOff();
        if (device.equalsIgnoreCase("SOUND-SYSTEM"))
            soundSystemRemote.turnOff();
        if (device.equalsIgnoreCase("SET-UP-BOX"))
            setTopBoxRemote.turnOff();
    }

}
