package Basics;

public class Benz {
	
	private String model;
	private int price;
	private boolean isEv;
	
	Benz(){
		System.out.println("hi i am from no arg");
	}
	
	Benz(String model, int price){
		this.model = model;
		this.price = price;
	}
	Benz(String model, int price, boolean isEv){
		this(model,price);
		this.isEv = isEv;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		System.out.println("i came here");
		this.price = price;
	}
	public boolean isEv() {
		return isEv;
	}
	public void setEv(boolean isEv) {
		this.isEv = isEv;
	}

	public void display() {
		System.out.println(isEv+" "+ price+" "+model);
	}
}
