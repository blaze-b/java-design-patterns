package com.mclebtec.java.builder.house.vo;

import java.util.Objects;

public abstract class Room {

    private Integer numberOfWindows = 1;
    private Integer numberOfWalls = 4;

    public Integer getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(Integer numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public Integer getNumberOfWalls() {
        return numberOfWalls;
    }

    public void setNumberOfWalls(Integer numberOfWalls) {
        this.numberOfWalls = numberOfWalls;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfWindows=" + numberOfWindows +
                ", numberOfWalls=" + numberOfWalls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Objects.equals(numberOfWindows, room.numberOfWindows)
                && Objects.equals(numberOfWalls, room.numberOfWalls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfWindows, numberOfWalls);
    }

}

