package Basics;

public class Ford implements Car{
	Ford(){
		System.out.println(" from ford");
	}
	public void start() {
		System.out.println("i can start with keys and in manual mode");
	}
	public void stop() {
		System.out.println("engine stopped");
	}
	
}
