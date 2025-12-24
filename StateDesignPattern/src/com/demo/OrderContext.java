package com.demo;

public class OrderContext {

    private OrderState orderState;
    public OrderContext() {
        this.orderState = new NewOrderState();
    }
    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }
    public void setNextOrderState() {
        orderState.next(this);
    }


}
