package com.demo.strategy;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("pay in cash");
    }
}
