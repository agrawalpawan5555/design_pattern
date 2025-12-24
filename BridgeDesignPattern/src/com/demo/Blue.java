package com.demo;

public class Blue implements Color {

    Blue()
    {
        System.out.println("blue shape");
    }

    @Override
    public void apply() {
        System.out.println("Blue");
    }
}
