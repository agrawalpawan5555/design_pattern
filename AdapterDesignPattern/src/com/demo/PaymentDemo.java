package com.demo;

public class PaymentDemo {
    public static void main(String[] args) {

        PaymentAdapter paymentAdapter=new PaymentAdapter( new PayPalService());
        paymentAdapter.pay(7000000000d);

    }
}
