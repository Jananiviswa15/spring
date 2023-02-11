package Basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile.xml");
		Benz benzObj = appContext.getBean("obj3", Benz.class);
		benzObj.display();

	}

}
