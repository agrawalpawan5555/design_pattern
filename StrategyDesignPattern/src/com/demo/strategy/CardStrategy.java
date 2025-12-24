package com.demo.strategy;

public class CardStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("pay through Card payment");
    }
}
