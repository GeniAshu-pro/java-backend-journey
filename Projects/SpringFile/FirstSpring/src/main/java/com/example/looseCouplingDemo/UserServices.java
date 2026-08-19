package com.example.looseCouplingDemo;

public class UserServices {
      NotificationServices notificationServices;
      public UserServices (){
      }


    public UserServices(NotificationServices notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void setNotificationServices(NotificationServices notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void notifyUser(String message){
        notificationServices.send("Hello");
    }
}
