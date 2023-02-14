package BeanCreation2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //acts as an config file, replaceent of ur xml
@ComponentScan(basePackages = "BeanCreation2")
public class CompanyConfig {
	
	/*@Bean
	//createDevBean = new PythonDevelopers();
	public Developers createDevBean() {
		return new JavaDevelopers();
	}

	@Bean 
	public Manager createManagerBean() {
		return new Manager();
	}
	
	@Bean//name of the bean ll b method name only
	//@Bean(name = "newNameForTheBean")
	//@Bean(name = {"bean1", "bean2"}
	public Company craeteCompanyBean() {
	//	Company comp = new Company(createManagerBean());
		Company comp = new Company();
		comp.setMngr(createManagerBean());
		comp.setDev(createDevBean());
		return comp;
		//return new Company();
	}

*/	
}
