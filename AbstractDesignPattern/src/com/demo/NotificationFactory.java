package com.demo;

public class NotificationFactory {

    public static NotificationService createNotification(String notificationType) {

        switch (notificationType) {

            case "SMS":
                return new SMSNotificationService();
                case "EMAIL":
                    return new EmailNotificationService();
                    default:
                        return null;
        }
    }
}
