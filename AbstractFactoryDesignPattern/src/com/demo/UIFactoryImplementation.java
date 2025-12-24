package com.demo;

public class UIFactoryImplementation {

    public static void main(String[] args) {

        UIFactory uiFactory = UIFactoryUsage.createUIFactory("Windows");
        uiFactory.paint();

    }
}
