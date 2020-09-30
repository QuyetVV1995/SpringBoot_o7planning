package com.example.demo;

import com.example.demo.bean.GreetingService;
import com.example.demo.bean.MyComponent;
import com.example.demo.config.AppConfiguration;
import com.example.demo.lang.Language;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// Tạo ra một đối tượng ApplicationContext bằng cách đọc cấu hỉnh
		// trong class AppConfiguration
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		System.out.println("----------------");
		Language language = (Language)context.getBean("language");
		System.out.println("Bean Language: " + language);
		System.out.println("Call language.sayBye(): "+ language.getBye());
		System.out.println("----------");

		GreetingService service = (GreetingService) context.getBean("greetingService");
		service.sayGreeting();

		System.out.println("----------");
		MyComponent myComponent = (MyComponent) context.getBean("myComponent");
		myComponent.showAppInfo();
	}

}
