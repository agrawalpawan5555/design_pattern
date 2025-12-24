package com.demo;

import com.demo.context.PaymentContext;
import com.demo.strategy.CashPaymentStrategy;
import com.demo.strategy.PaymentStrategy;
import com.demo.strategy.UPIPaymentStrategy;

public class StrategyMain {
    public static void main(String[] args) {

        PaymentContext paymentContext = new PaymentContext();
        PaymentStrategy paymentStrategy = new CashPaymentStrategy();
        paymentContext.setPaymentStrategy(paymentStrategy);
        paymentContext.pay(100);

        paymentContext.setPaymentStrategy(new UPIPaymentStrategy());
        paymentContext.pay(200);
    }
}
