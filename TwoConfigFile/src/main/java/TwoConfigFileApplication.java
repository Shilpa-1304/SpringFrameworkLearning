import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TwoConfigFileApplication {

	public static void main(String[] args) {

		// Loading the context from the XML configuration file
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextConfiguration.xml");

	}

}
