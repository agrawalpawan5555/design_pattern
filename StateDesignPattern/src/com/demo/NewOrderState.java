package com.demo;

public class NewOrderState implements OrderState {

    private String state;
    public NewOrderState() {
        this.state = "New Order State";
    }


    @Override
    public void next(OrderContext orderContext) {
        orderContext.setOrderState(new InProgressOrderState());
    }

    @Override
    public void printOrderState() {
       System.out.println(state);
    }
}
