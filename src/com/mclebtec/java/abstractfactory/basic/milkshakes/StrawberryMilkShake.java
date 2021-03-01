package com.mclebtec.java.abstractfactory.basic.milkshakes;

public class StrawberryMilkShake implements MilkShake {

    String brand;
    Integer iceCubes;

    public StrawberryMilkShake(String brand, Integer iceCubes) {
        this.brand = brand;
        this.iceCubes = iceCubes;
    }

    @Override
    public Integer getIceAmount() {
        return this.iceCubes;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
