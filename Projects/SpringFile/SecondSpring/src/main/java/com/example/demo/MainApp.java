package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
//        it's give Instruction to spring to read file  xml
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

//        there is  way of doing this by using Annotation ConfigApp
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService = (GreetingService) applicationContext.getBean("myBean");
        greetingService.sayHello();
    }
}
