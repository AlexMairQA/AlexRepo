package com.garage;

public class Car extends Vehicle {

private int NoOfSeats=4;
private int noOfWindows=6;
private String upholstery;
private double sizeOfBoot=0.25;
	
	public Car() {
		// TODO Auto-generated constructor stub
		
		super();
	}
	
	public Car(double  bootSize, String upholstery, String make, String colour, String licencePlate, int wheels, int engineCC, int noOfCylinders) {
		// TODO Auto-generated constructor stub
		
		
		super(make, colour, licencePlate, wheels, engineCC, noOfCylinders);
		this.sizeOfBoot= bootSize;
		this.upholstery=upholstery;
		
	}

	public int getNoOfSeats() {
		return NoOfSeats;
	}

	public int getNoOfWindows() {
		return noOfWindows;
	}

	public String getUpholstery() {
		return upholstery;
	}

	public double getSizeOfBoot() {
		return sizeOfBoot;
	}
	
	


	
	
	

}
