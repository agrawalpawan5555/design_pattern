package com.demo;

public class SMSNotificationService implements NotificationService {
    @Override
    public void notifyUser() {
        System.out.println("notify user using SMS");
    }
}
