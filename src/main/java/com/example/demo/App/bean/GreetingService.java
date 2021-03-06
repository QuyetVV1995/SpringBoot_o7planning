package com.example.demo.App.bean;

import com.example.demo.App.lang.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*@Service xử lý các nghiệp vụ của ứng dụng.*/
@Service
public class GreetingService {
    @Autowired
    Language language;
    public GreetingService(){

    }

    public void sayGreeting(){
        String greeting = language.getGreeting();
        System.out.println("Greeting: " + greeting);
    }
}
