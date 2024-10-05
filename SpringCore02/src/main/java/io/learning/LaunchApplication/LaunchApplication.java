package io.learning.LaunchApplication;
import io.learning.LaunchApplication.Main.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LaunchApplication {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContextConfiguration.xml");
		System.out.println("Hi Universe, Let's learn Loose Coupling using Spring Framework !");
		Employee emp=context.getBean("employeeB",Employee.class);
		System.out.println(emp.toString());
		System.out.println("________________________________________");
		Employee emp1=context.getBean("employeeA",Employee.class);
		System.out.println(emp1.toString());

	}

}
