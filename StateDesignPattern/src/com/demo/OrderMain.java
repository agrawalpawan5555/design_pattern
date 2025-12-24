package com.demo;

public class OrderMain {

    public static void main(String[] args) {

        OrderContext orderContext = new OrderContext();
        orderContext.getOrderState().printOrderState();
        orderContext.setNextOrderState();
        orderContext.getOrderState().printOrderState();
        orderContext.setNextOrderState();
        orderContext.getOrderState().printOrderState();

    }

}
