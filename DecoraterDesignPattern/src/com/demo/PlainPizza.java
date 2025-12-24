package com.demo;

public class PlainPizza implements Pizza {

    @Override
    public void description() {

        System.out.println("This is a Plain Pizza");
    }

    @Override
    public int getCost() {
        return 100;
    }
}
