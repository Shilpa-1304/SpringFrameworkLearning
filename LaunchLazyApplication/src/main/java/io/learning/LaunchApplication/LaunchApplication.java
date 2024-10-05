package io.learning.LaunchApplication;
import io.learning.LaunchApplication.Main.Employee;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LaunchApplication {

	public static void main(String[] args) {
		//IOC Container created
		DefaultListableBeanFactory beanFactoryContainer=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(beanFactoryContainer);
		//configuration file added to IOC, in lazy initialization,to use 2 configuration file , we don't need to 2 IOC
		reader.loadBeanDefinitions("applicationContextConfiguration.xml");
//Lazy Loading: bean will be created only when getBean method is called but in applicatonContext, bean is created automatically.
		Employee emp=beanFactoryContainer.getBean("employeeB",Employee.class);
		System.out.println(emp);

	}

}
