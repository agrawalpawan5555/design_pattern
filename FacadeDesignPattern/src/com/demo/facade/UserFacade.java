package com.demo.facade;

import com.demo.service.OrderService;
import com.demo.service.PaymentService;
import com.demo.service.UserService;

public class UserFacade {

    private UserService userService= new UserService();
    private OrderService orderService= new OrderService();
    private PaymentService paymentService= new PaymentService();

    public void placeOrder() {
        userService.getUserDetails();
        orderService.doOrder();
        paymentService.doPayment();
    }
}
