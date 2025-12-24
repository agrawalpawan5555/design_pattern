package com.demo;

public class InProgressOrderState implements OrderState {

    private String state;
    public InProgressOrderState() {
        this.state = "INPROGRESS";
    }
    public InProgressOrderState(String state) {}

    @Override
    public void next(OrderContext orderContext) {
        orderContext.setOrderState(new CompleteOrderState());
    }

    @Override
    public void printOrderState() {

        System.out.print(state);
    }
}
