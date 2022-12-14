package br.com.calosguilherme.padaroProjeto1;

public abstract class Car {
	
	private int horsePawer;
	private String fuelSource, color;
	
	
	public Car(int horsePower, String fuelSource, String color) {
		this.horsePawer = horsePower;
		this.fuelSource = fuelSource;
		this.color = color;
	}
	
	public void startEngine() {
		System.out.println("The" + fuelSource + "engine has been started, an is ready to utilize" + horsePawer);
	}
	
	public void clean() {
		System.out.println("Car has been cleaned, and the " + color.toLowerCase() + "color shines");
	}
	
	public void mechanicCheck() {
		System.out.println("Car has been checked by mechanic.Everything looks good!");
	}
	
	public void fuelCar() {
		System.out.println("Car is being filled with "+ fuelSource.toLowerCase());
	}
	

}
