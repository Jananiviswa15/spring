package Basics;

public class AdvMobile {

	private	Airtel sim;
	
	public void setSim(Airtel sim) {
		this.sim = sim;
	}


		public void calling() {
			System.out.println(" i am from adv mobile");
			sim.calling();
		}
}
