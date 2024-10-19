package com.learning.spring_data_jpa;

import com.learning.spring_data_jpa.dao.IEmployeeRepo;
import com.learning.spring_data_jpa.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaApplication.class, args);
		for (String name: container.getBeanDefinitionNames()){
			System.out.println("====>  Bean:  "+name);
		}
		System.out.println("Total beans: "+container.getBeanDefinitionCount());
		//Fetching data
//		IEmployeeRepo repo =container.getBean(IEmployeeRepo.class);
//		Iterable<Employee> list=repo.findAll();
//		list.forEach(employee -> System.out.println(employee.toString()));

		//Saving data
//		Employee emp=new Employee(6,"Aparna","PO");
//		System.out.println("Data saved: "+repo.save(emp));
	}

}
