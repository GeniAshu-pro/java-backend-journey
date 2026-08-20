package com.example.looseCouplingDemo;

import org.springframework.stereotype.Component;

@Component("EmailNotificationService")
public class EmailNotificationService implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println(" Email Notification: "+message);
    }
}
