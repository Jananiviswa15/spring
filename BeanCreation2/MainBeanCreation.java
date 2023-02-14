package BeanCreation2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeanCreation {

	public static void main(String[] args) {
		
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile5.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(CompanyConfig.class);
		Company comp = context.getBean("company", Company.class);
		comp.display();

	}

}
