package com.example.looseCouplingDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("EmailNotificationService")
public class EmailNotificationService implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println(" Email Notification: "+message);
    }
}
