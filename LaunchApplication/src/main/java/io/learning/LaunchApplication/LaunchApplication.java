package io.learning.LaunchApplication;

import io.learning.LaunchApplication.implementation.Java;
import io.learning.LaunchApplication.implementation.SpringBoot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LaunchApplication {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContextConfiguration.xml");
		System.out.println("Hi Universe, Let's learn Loose Coupling using Spring Framework !");
		LooseCouplingExample example=context.getBean(LooseCouplingExample.class);
		Java java= context.getBean(Java.class);
		SpringBoot spring=context.getBean(SpringBoot.class);

		java.setPrice(231);

		int price=example.buyCourse(java);
		int springPrince=example.buyCourse(spring);
		System.out.println("Price for java is "+price);
		System.out.println("Spring Boot Price: "+springPrince);
	}

}
