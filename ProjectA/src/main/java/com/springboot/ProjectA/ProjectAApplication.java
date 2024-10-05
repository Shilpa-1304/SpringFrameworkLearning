package com.springboot.ProjectA;

import com.springboot.ProjectA.implementation.Java;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAApplication.class, args);
		LooseCouplingExample example=new LooseCouplingExample();
		int price=example.buyCourse(new Java());
		System.out.println("Price: "+price);

	}

}
