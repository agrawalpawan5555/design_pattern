package com.demo;

public class Rectangle extends Shape {


    Rectangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
