package com.demo;

public class EmailNotificationService implements NotificationService {
    @Override
    public void notifyUser() {
        System.out.println("notify user using email");
    }
}
