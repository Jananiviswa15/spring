package Basics;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		/*MG mgCar = new MG();
		mgCar.start();
		mgCar.stop();*/
		
		/*Car obj = new MG();, new Ford()
		obj.start();
		obj.stop();*/
		
		
		/* creating obj and managing them --> spring */
		/* config --> what are the classes, name of the obj 
		 * IOC --> inversion of control container
		 * beanfactory
		 * appilcationContext
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
	/*	MG obj = (MG) context.getBean("mgObj");
		obj.start();
		obj.stop();
		
		Ford obj1 = context.getBean("fordObj", Ford.class);
		obj1.start();
		obj1.stop();*/
		
		
		Car carType = context.getBean("carObj", Car.class);
		carType.start();
		carType.stop();
	}

}
