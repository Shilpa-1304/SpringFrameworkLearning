package com.learning.spring_and_jdbc;

import com.learning.spring_and_jdbc.Employee.Employee;
import com.learning.spring_and_jdbc.Employee.EmployeePersistenceLayer;
import com.learning.spring_and_jdbc.Employee.EmployeeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringAndJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringAndJdbcApplication.class, args);
//		Student student=container.getBean(Student.class);
//		student.getStudent();
//		container.close();
//		System.out.println(student+"Bean destroyed");
		EmployeeServiceImpl employeeBeen=container.getBean(EmployeeServiceImpl.class);
//		List<Employee> emplList=employeeBeen.getEmployeeDetail();
//		for (Employee emp:emplList) {
//			System.out.println(emp.toString());
//		} Another greate way of writing the code (22 to 25)
		employeeBeen.getEmployeeDetail().stream().forEach(employee -> System.out.println(employee.toString()));

	}

}
