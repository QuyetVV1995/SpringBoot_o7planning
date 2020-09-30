package com.example.demo.bean;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class MyRepository {
    public String getAppName(){
        return "Hello String App";
    }

    public Date getSystemDateTime(){
        return new Date();
    }
}
