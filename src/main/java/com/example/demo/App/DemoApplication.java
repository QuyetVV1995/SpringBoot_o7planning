package com.example.demo.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// Tạo ra một đối tượng ApplicationContext bằng cách đọc cấu hỉnh
		// trong class AppConfiguration
		/*ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		System.out.println("----------------");
		Language language = (Language)context.getBean("language");
		System.out.println("Bean Language: " + language);
		System.out.println("Call language.sayBye(): "+ language.getBye());
		System.out.println("----------");

		GreetingService service = (GreetingService) context.getBean("greetingService");
		service.sayGreeting();

		System.out.println("----------");
		MyComponent myComponent = (MyComponent) context.getBean("myComponent");
		myComponent.showAppInfo();*/
		SpringApplication.run(DemoApplication.class, args);
	}

}
