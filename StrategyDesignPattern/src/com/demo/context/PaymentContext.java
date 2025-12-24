package com.demo.context;

import com.demo.strategy.PaymentStrategy;

public class PaymentContext {

    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(int amount)
    {
        paymentStrategy.pay(amount);
    }

}
