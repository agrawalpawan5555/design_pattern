package com.demo.dierector;

public class LuxryHouseBuilder {

    public static House constructLuxryHouse() {

        House house = new House.HouseBuilder().foundation("luxury")
                .roof("luxury")
                .garage(true)
                .swimmingpool(true)
                .build();
        return house;

    }


}
