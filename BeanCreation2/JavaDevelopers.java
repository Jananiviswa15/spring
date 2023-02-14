package BeanCreation2;

import org.springframework.stereotype.Component;

@Component
//@Component("dev")
public class JavaDevelopers implements Developers{

	public void craeteWebApp() {
		System.out.println("i will use struts, servlets, spring...");
	}

}
