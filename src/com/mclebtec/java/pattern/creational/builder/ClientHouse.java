package com.mclebtec.java.pattern.creational.builder;

import com.mclebtec.java.pattern.creational.builder.house.Architect;
import com.mclebtec.java.pattern.creational.builder.house.OneBedroomHouseBuilder;
import com.mclebtec.java.pattern.creational.builder.house.TwoBedroomHouseBuilder;
import com.mclebtec.java.pattern.creational.builder.house.vo.House;

public class ClientHouse {
    public static void main(String[] args) {
        System.out.println("Builder Design pattern example ");
        Architect architect = new Architect();
        architect.setBuilder(new OneBedroomHouseBuilder());
        architect.setBuilder(new TwoBedroomHouseBuilder());
        architect.buildHouse();
        House house = architect.getFinishedHouse();
        System.out.println(house);
    }
}
