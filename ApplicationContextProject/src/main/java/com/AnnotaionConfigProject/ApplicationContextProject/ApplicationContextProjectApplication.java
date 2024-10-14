package com.AnnotaionConfigProject.ApplicationContextProject;

import com.AnnotaionConfigProject.ApplicationContextProject.config.ApplicationConfiguration;
import com.AnnotaionConfigProject.ApplicationContextProject.service.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApplicationContextProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

		// Now you can retrieve your GreetingService bean
		GreetingService greetingService = context.getBean(GreetingService.class);
		System.out.println(greetingService.generateGreeting("Shilpa"));
	}

}
