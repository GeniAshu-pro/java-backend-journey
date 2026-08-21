package com.example.looseCouplingDemo;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationServices {
    @Override
    public void send(String message) {
        System.out.println(" SMS Notification: "+message);
    }
}


