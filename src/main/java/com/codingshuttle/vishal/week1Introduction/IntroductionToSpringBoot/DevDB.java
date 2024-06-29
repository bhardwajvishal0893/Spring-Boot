package com.codingshuttle.vishal.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "development")
@Qualifier("dev")
public class DevDB implements DB{
    public String getData()
    {
        return "Dev Data";
    }

}
