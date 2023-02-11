package Basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod2 {

	public static void main(String[] args) {
	/*	Airtel airObj = new Airtel();
		Mobile obj = new Mobile();  //sim --> null
		
		obj.setSim(airObj);
		obj.calling();*/
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile2.xml");
		AdvMobile obj = appContext.getBean("advmobile", AdvMobile.class);
		obj.calling();

	}

}
