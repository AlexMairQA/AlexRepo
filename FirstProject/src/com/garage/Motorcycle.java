package com.garage;

public class Motorcycle extends Vehicle{

	public Motorcycle() {
		// TODO Auto-generated constructor stub
		super("Harley Davidson", "pink", "HELL666", 2, 3000, 666);
		
	}
	
	public int getMotorcycleWheels() {
		return super.getWheels();
	}

}
