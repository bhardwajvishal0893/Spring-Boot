package com.codingshuttle.vishal.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
    private DB db;

    //@Autowired
    //@Qualifier("dev")
    //private DB db; this will also resolve confusion
    String getData()
    {
        return db.getData();
    }
}
