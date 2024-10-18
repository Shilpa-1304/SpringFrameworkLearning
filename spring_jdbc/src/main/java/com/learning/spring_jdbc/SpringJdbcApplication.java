package com.learning.spring_jdbc;

import com.learning.spring_jdbc.dao.EmployeeDao;
import com.learning.spring_jdbc.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcApplication.class, args);
		EmployeeDao repo=container.getBean(EmployeeDao.class);
		Employee emp=new Employee(6, "Mountain", "Evert");
//		repo.createTable();
		repo.updateTable(emp);
	}

}
