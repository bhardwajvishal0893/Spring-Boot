package com.codingshuttle.vishal.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name = "deploy.env", havingValue = "production")
@Qualifier("prod")
public class ProdDB implements DB{
    public String getData()
    {
        return "Prod Data";
    }
}
