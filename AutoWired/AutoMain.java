package AutoWired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMain {

	public static void main(String[] args) {
	/*Person obj = new Person();  //obj.adrs = null
	Address adrsObj = new Address();
	obj.setAdrs(adrsObj); // obj.adrs = adrsObj
	obj.displayAddress();*/

		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile4.xml");
		PersonCls obj = appContext.getBean("personObj", PersonCls.class);
		obj.displayAddress();
	
	}

}
