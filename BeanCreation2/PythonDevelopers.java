package BeanCreation2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PythonDevelopers implements Developers{

	public void craeteWebApp() {
		System.out.println("i will use python, django...");
	}
}
