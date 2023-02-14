package BeanCreation2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*<bean id = "company" class = "Company"> in xml */

@Component  //company
//@Component("jdfhf")
public class Company {

	
	private String CEO;
	
	
	@Required//compuslory set the values
	public void setCEO(String cEO) {
		CEO = cEO;
	}

	@Value("zoho")
	private String companyName;
	
	@Autowired
	//@qualifier
	private Manager mngr;

	@Autowired
	//@qualifier
	private Developers dev;  // new Javadevelopers, pythondeveloper

	/*public Company() {}
	public Company(Manager mngr){
		this.mngr = mngr;
	}*/

	/*@Autowired //bytype byname
	public void setDev(Developers dev) {
		this.dev = dev;
	}

	@Autowired
	use @ qualifier
	public void setMngr(Manager mngr) {
		this.mngr = mngr;
	}*/

	public void display(){
		System.out.println(companyName);
		mngr.managerDetails();
		dev.craeteWebApp();
		System.out.println("helloo i got created");
	}
}
