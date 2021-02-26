package com.mclebtec.java.builder.house;

import com.mclebtec.java.builder.house.vo.House;

public abstract class HouseBuilder {

    private House house = null;

    public House getHouse() {
        return house;
    }

    public HouseBuilder() {
        this.house = new House();
    }

    public abstract void addRooms();

    public void addSecuritySystem(){
        System.out.println("Adding security system");
    }

    public void addPlumbingSystem(){
        System.out.println("Adding plumbing system");
    }

    public void addAirConditionerSystem(){
        System.out.println("Adding air conditioning system");
    }

    public void paintHouse(String color){
        System.out.println("Painting house with color " + color);
        house.setExteriorColor(color);
    }
}
