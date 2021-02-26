package com.mclebtec.java.builder;

import com.mclebtec.java.builder.house.Architect;
import com.mclebtec.java.builder.house.OneBedroomHouseBuilder;
import com.mclebtec.java.builder.house.TwoBedroomHouseBuilder;
import com.mclebtec.java.builder.house.vo.House;

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
