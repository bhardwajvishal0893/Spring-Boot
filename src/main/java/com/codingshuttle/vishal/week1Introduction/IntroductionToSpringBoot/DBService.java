package com.codingshuttle.vishal.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    private final DB db;

    // FIeld INjection
    //    @Autowired
//    private DB db;
// Constructor Injection should be preffered as it gives us flexibilty to make the reference final which makes it unmutable
    // Also final variables should be initilaized for sure
    public DBService(DB db)
    {
        this.db = db;
    }
    //@Autowired
    //@Qualifier("dev")
    //private DB db; this will also resolve confusion
    String getData()
    {
        return db.getData();
    }
}
