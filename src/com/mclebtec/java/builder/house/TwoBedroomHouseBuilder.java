package com.mclebtec.java.builder.house;

import com.mclebtec.java.builder.house.vo.BedRoomOne;
import com.mclebtec.java.builder.house.vo.BedRoomTwo;
import com.mclebtec.java.builder.house.vo.LivingRoom;

public class TwoBedroomHouseBuilder extends HouseBuilder {
    @Override
    public void addRooms() {
        getHouse().rooms.add(new BedRoomOne());
        getHouse().rooms.add(new BedRoomOne());
        getHouse().rooms.add(new BedRoomTwo());
        getHouse().rooms.add(new LivingRoom());
    }
}
