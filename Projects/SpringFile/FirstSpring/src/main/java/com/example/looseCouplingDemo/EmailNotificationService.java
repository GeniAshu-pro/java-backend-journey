package com.example.looseCouplingDemo;

public class EmailNotificationService implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println(" Email Notification: "+message);
    }
}
