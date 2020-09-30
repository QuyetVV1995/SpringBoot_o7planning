package com.example.demo.App.config;

import com.example.demo.App.lang.Language;
import com.example.demo.App.lang.impl.English;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@Configuration 	là một Annotation đánh dấu trên một Class cho phép Spring Boot
        biết được đây là nơi định nghĩa ra các Bean*/
@Configuration
@ComponentScan("com.example.demo.App.bean")
public class AppConfiguration {
    @Bean(name = "language")
    public Language getLanguage(){
        return new English();
    }
}
