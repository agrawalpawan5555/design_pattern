package com.demo;

public class DemoMain {
    public static void main(String[] args) {

        Shape bulueRectangle = new Rectangle(new Blue());
        bulueRectangle.draw();

        Shape redCircle = new Circle(new Red());
        redCircle.draw();
    }
}
