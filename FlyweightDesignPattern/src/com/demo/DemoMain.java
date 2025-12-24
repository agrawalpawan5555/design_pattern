package com.demo;

import java.util.ArrayList;
import java.util.List;

public class DemoMain {
    public static void main(String[] args) {

        List<String> colorList = new ArrayList<String>();
        colorList.add("red");
        colorList.add("green");
        colorList.add("blue");

        for(String color:colorList){

           Shape circle= ShapeFactory.getShape("CIRCLE");
           if(circle==null){
               circle=new Circle();
               ShapeFactory.shapMap.put("CIRCLE",circle);
               circle.draw();
               System.out.println(color);
           }
           else {

               circle.draw();
               System.out.println(color);
           }
        }

    }
}
