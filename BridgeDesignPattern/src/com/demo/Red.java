package com.demo;

public class Red implements Color {

    Red()
    {
        System.out.println("red shape");
    }

    @Override
    public void apply() {
        System.out.println("Red");
    }
}
