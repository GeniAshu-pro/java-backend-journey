package com.example.looseCouplingDemo;

import com.example.demo.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      UserServices userServices= (UserServices) context.getBean("UserServices");
      userServices.notifyUser("Hello,bro");


    }
}
