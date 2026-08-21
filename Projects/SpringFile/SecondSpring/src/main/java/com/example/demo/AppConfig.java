package com.example.demo;

import com.example.looseCouplingDemo.NotificationServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
//Spring Scan this package "com.example"
public class AppConfig {
//  what this initMethod do :its tell spring after creating and injecting this bean call its init() method
//    what this destroyMethod do: due to this Spring know when bean is destroyed then call this cleanup method ()
//    @Bean make sure whatever this lifecyclebean method is returing as a object I need to use it a as a bean (marked it bean)
    @Bean (initMethod = "init" , destroyMethod = "cleanup")
    public LifeCycleOfBean lifeCycleOfBean (NotificationServices notificationServices){
        return new LifeCycleOfBean(notificationServices);
    }

}
