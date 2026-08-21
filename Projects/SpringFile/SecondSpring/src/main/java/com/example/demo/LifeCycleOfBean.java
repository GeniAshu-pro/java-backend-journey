package com.example.demo;

import com.example.looseCouplingDemo.NotificationServices;

public class LifeCycleOfBean {
   private NotificationServices notificationServices ;

   public LifeCycleOfBean(NotificationServices notificationServices){
       System.out.println("Constructor Called : Dependency Injected");
       this.notificationServices=notificationServices;
   }

   public void init(){
       System.out.println("init called : Bean Initialized");
       notificationServices.send("Hello from init()");
   }

   public void performTask( ){
       System.out.println("Ready for use !!!");
   }

   public void cleanup( ){
       System.out.println("cleanup() being called");
   }

}
