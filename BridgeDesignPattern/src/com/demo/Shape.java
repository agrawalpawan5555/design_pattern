package com.demo;

public abstract class Shape {

    private Color color;
    Shape(Color color) {
        this.color = color;
    }
    public abstract void draw();
}
