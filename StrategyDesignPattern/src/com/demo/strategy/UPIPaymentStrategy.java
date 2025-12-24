package com.demo.strategy;

public class UPIPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("pay through UPI");
    }
}
