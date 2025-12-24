package com.demo;

public class Circle extends Shape {


    Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}
