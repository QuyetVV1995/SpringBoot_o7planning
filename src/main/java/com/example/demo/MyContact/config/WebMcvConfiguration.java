package com.example.demo.MyContact.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMcvConfiguration implements WebMvcConfigurer {
    @Bean
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        /*classpath:messages chỉ ra đường dẫn tới file mesages.properties (tính từ thư mục src/main/resources).*/
        messageSource.addBasenames("classpath:messages");
        /*Do file properties của chúng ta có chứa tiếng Việt, nên cần setDefaultEncoding("UTF-8").*/
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
