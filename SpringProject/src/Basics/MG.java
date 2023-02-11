package Basics;

public class MG implements Car{
	
	MG(){
		System.out.println("I am from mg");
	}
	public void start() {
		System.out.println("i can start with keys and in manual mode and i have some extra advanced features");
	}
	public void stop() {
		System.out.println("engine stopped");
		System.out.println("efficiently prgmed for stopping");
	}
}
