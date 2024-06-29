package com.codingshuttle.vishal.week1Introduction.IntroductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    // four types of scope singleton, prototype, request, websocket
    Apple getApple(){
        return new Apple(); //  Here we are responsible for bean creation but injection will be handled by IOC
        //Now one thing you will have to careful component annotation will anyway create a bean, and this configuration will
        // also create bean which will cause 2 beans and error.
        //Remove component annotation and it will work
    }
}
