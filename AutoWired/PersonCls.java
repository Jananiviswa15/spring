package AutoWired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PersonCls {

	@Autowired
	@Qualifier("adrsObj")
	private Address adrs;

	/*PersonCls(){}
	
	//@Autowired //autowire = constrictor
	PersonCls(Address adrs){
		this.adrs = adrs;
	}

/*	
	@Autowired //1.byType 2.byName
	@Qualifier("adrsObj")
	public void setAdrs(Address adrs) {
		System.out.println(" i came to settermethod");
		this.adrs = adrs;  //adrsObj
	}*/

	public void displayAddress() {
		if(adrs != null) {
			adrs.display();
		System.out.println(adrs.doorNum +" "+ adrs.street);}
		else 
			System.out.println("your are null value");
	}
}
