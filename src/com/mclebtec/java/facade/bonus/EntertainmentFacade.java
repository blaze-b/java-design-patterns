package com.mclebtec.java.facade.bonus;

public class EntertainmentFacade {

    private final Nexus nexus;
    private final Amplifier amplifier;
    private final Projector projector;

    public EntertainmentFacade() {
        this.nexus = new Nexus();
        this.amplifier = new Amplifier();
        this.projector = new Projector();
    }

    public void playMovie(String name){
        nexus.downloadMedia(name);
        masterPowerOn();
        amplifier.attachAmplifierForHomeTheater();
        projector.adjustProjectorForMovie();
    }


    public void playMusic(String name) {
        nexus.downloadMedia(name);
        amplifier.powerOn();
        amplifier.attachAmplifierForMusic();
    }

    public void playGame(String name) {
        nexus.downloadMedia(name);
        masterPowerOn();
        amplifier.attachAmplifierForMusic();
        projector.adjustProjectorForGame();
    }

    public void masterPowerOff() {
        amplifier.powerOff();
        projector.powerOff();
    }

    public void masterPowerOn() {
        amplifier.powerOn();
        projector.powerOn();
    }
}
