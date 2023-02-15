package JDBC;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	/*Students obj = new Students();
	obj.deleteRecord(1);
obj.displayAll();*/
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile6.xml");
		Students obj = context.getBean("studentObj", Students.class);
		obj.displayAll();
	}

}
