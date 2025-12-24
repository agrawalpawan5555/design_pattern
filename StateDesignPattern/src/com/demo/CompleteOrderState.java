package com.demo;

public class CompleteOrderState implements OrderState {

    private String orderState;
    public CompleteOrderState() {
        this.orderState = "Complete";
    }


    @Override
    public void next(OrderContext orderContext) {
        orderContext.setOrderState(null);
    }

    @Override
    public void printOrderState() {
       System.out.println(orderState);
    }
}
