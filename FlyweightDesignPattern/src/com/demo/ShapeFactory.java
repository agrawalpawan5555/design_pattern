package com.demo;

import java.util.HashMap;

public class ShapeFactory {

    public static HashMap<String,Shape> shapMap= new HashMap<>();

    public static Shape getShape(String shapeName){
        Shape shape = shapMap.get(shapeName);
        return shape;
    }

}
