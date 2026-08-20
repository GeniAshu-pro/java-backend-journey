package com.example.looseCouplingDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("UserServices")
//Spring manage this class as a bean
public class UserServices {
      NotificationServices notificationServices;
      public UserServices (){
      }

@Autowired
// Spring give this bean the dependency it's need
    public UserServices(NotificationServices notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void setNotificationServices(NotificationServices notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void notifyUser(String message){
        notificationServices.send("Hello Spring");
    }
}
