package com.demo;

public interface OrderState {
    void next(OrderContext orderContext);
    void printOrderState();
}
