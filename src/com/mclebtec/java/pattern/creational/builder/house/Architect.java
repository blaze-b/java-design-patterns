package com.mclebtec.java.pattern.creational.builder.house;

import com.mclebtec.java.pattern.creational.builder.house.vo.House;

public class Architect {

    private HouseBuilder builder;


    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public void buildHouse(){
        builder.addRooms();
        builder.addPlumbingSystem();
        builder.addAirConditionerSystem();
        builder.addSecuritySystem();
        builder.paintHouse("white");
    }

    public House getFinishedHouse(){
        return builder.getHouse();
    }
}
