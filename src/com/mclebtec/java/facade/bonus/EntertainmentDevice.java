package com.mclebtec.java.facade.bonus;

public class EntertainmentDevice {
}

class Nexus extends EntertainmentDevice {
    protected void downloadMedia(String name) {
        System.out.println("Searching for media");
        System.out.println("Making online payment ");
        System.out.println("downloaded from Nexus " + name);
    }
}

class Amplifier extends EntertainmentDevice {
    protected void powerOn() {
        System.out.println("Power on Amplifier");
    }

    protected void powerOff() {
        System.out.println("power Off Amplifier ");
    }

    protected void attachAmplifierForMusic() {
        System.out.println("Attaching music amplification");
    }

    protected void attachAmplifierForHomeTheater() {
        System.out.println("Attaching movie amplification ");
    }
}

class Projector extends EntertainmentDevice {
    protected void powerOn() {
        System.out.println("Power on Projector");
    }

    protected void powerOff() {
        System.out.println("power Off Projector ");
    }

    protected void adjustProjectorForMovie() {
        System.out.println("Attaching home theater mode");
    }

    protected void adjustProjectorForGame() {
        System.out.println("Attaching game console ");
    }
}
