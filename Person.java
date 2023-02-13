package Basics;

public class Person {

	private Callable mobileAdvMobile;
	//Callable obj = new Mobile2();
	//Callable AdvMobile = new AdvMobile();

	public void setMobileAdvMobile(Callable mobileAdvMobile) {
		System.out.println(" i came here");
		this.mobileAdvMobile = mobileAdvMobile;
	}

	public void calling() {
		mobileAdvMobile.calling();
	}
}

