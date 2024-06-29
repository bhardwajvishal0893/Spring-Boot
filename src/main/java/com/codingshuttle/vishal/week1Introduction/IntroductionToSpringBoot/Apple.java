package com.codingshuttle.vishal.week1Introduction.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component
public class Apple {
    void eatApple()
    {
        System.out.println("Eating Apple");
    }
    @PostConstruct
    void callThisBeforeAppleIsCreated()
    {
        System.out.println("Created the apple before use");
    }
    @PreDestroy
    void callThisBeforeDestruction()
    {
        System.out.println("Apple bean destroyed after application running is stopped");
        // If your bean scope is prototype it will create new objects whenever it is asked also it wont manage complete lifecycle
        // so we will have to handle cleanup
    }
}
