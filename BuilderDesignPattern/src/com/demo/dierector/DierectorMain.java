package com.demo.dierector;

public class DierectorMain {
    public static void main(String[] args) {

        House house= LuxryHouseBuilder.constructLuxryHouse();
        System.out.println(house);

    }
}
