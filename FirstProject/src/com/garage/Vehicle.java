package com.garage;

public abstract class Vehicle {
	
	
	private String licencePlate="HIB";
	private String make="Ford Model T";
	private int wheels=4;
	private String colour="black";
	private int engineCC=3;
	private int noOfCylinders=1;
	
public Vehicle() {
		
	}

	public Vehicle(String make, String colour, String licencePlate, int wheels, int engineCC, int noOfCylinders) {
		super();
		this.make=make;
		this.colour=colour;
		this.licencePlate=licencePlate;
		this.wheels = wheels;
		this.engineCC=engineCC;
		this.noOfCylinders=noOfCylinders;
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}

	public int getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setNoOfCylinders(int noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}

	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	

	

	public String getLicencePlate() {
		return licencePlate;
	}

	public String getMake() {
		return make;
	}

	public int getWheels() {
		return wheels;
	}
	
	
	
	

}
