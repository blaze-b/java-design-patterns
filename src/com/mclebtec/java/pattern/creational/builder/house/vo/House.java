package com.mclebtec.java.pattern.creational.builder.house.vo;

import java.util.ArrayList;
import java.util.List;

public class House {

    public List<Room> rooms = new ArrayList<>();
    private String exteriorColor = "white";

    public String getExteriorColor() {
        return exteriorColor;
    }

    public void setExteriorColor(String exteriorColor) {
        this.exteriorColor = exteriorColor;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms size=" + rooms.size() +
                ", exteriorColor='" + exteriorColor + '\'' +
                '}';
    }
}
