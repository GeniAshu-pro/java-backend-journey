package com.example.looseCouplingDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
      UserServices userServices= (UserServices) context.getBean("UserServices");
      userServices.notifyUser("Hello,bro");

    }
}
