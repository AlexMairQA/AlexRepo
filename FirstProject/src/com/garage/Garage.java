package com.garage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Garage {
	
	List<Vehicle>vehicles;

	public Garage() {
		// TODO Auto-generated constructor stub
		//vehicles= new ArrayList<>();
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	
	public void addVehicle(Vehicle newVehicle) {
		vehicles.add(newVehicle);
	}
	
	public void removeVehicle(String licencePlate) {
		
		/*for (Vehicle vehicle : vehicles) {
			if(vehicle.getLicencePlate()=="HIB")
				vehicles.remove(vehicle);
		}*/
		
		int j = 0;
		for (; j < vehicles.size(); j++) {
			if(vehicles.get(j).getLicencePlate().equals(licencePlate)) {
				vehicles.remove(j);
				//break;
			}
		
		}
	}
	public int calculateBill() {
		int bill=0;
		for (Vehicle vehicle : vehicles) {
			if(vehicle.getMake()=="Ford Model T")
				bill+=100;
			else if(vehicle.getMake()=="Harley Davidson")
				bill+=200;
			else if(vehicle.getMake()=="Ferarri")
				bill+=300;
			else
				bill+=0;
		}
		return bill;
		}
		
	}

	

