package com.example.demo.App.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component /*Là annotation đánh dấu trên class giúp Spring biết nó là Bean*/
public class MyComponent {
    /*@Autowired Là annotation biểu thị rằng dependency sẽ được tự động inject vào object.*/
    @Autowired
    private MyRepository repository;

    public void showAppInfo(){
        System.out.println("Now is: " + repository.getSystemDateTime());
        System.out.println("App Name: " + repository.getAppName());
    }
}
