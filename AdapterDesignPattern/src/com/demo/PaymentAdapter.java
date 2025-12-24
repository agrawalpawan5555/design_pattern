package com.demo;

public class PaymentAdapter implements Payment {

    private PayPalService payPalService;
    public PaymentAdapter(PayPalService payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void pay(double amount) {
       payPalService.pay((int)amount);
    }
}
