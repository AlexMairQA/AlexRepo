package com.garage;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motorcycle hellsAngel = new Motorcycle();
		Car mustang= new Car();
		System.out.println("Make: "+hellsAngel.getMake());
		System.out.println("Colour: "+hellsAngel.getColour());
		System.out.println("Wheels: "+hellsAngel.getWheels());
		System.out.println("Engine CC"+hellsAngel.getEngineCC()+"\n\n");
		
		LinkedList<Vehicle>cars= new LinkedList<>(Arrays.asList(new Car(), new Car(3.0, "leather", "Ferarri", "red", "ABC123", 4, 3000, 97), new Car()));
		
		Garage myGarage= new Garage();
		myGarage.setVehicles(cars);
		
		List<Vehicle>myCars=myGarage.getVehicles();
		
		for (Vehicle vehicle : myCars) {
			System.out.println("Make: "+vehicle.getMake());
			System.out.println("Colour: "+vehicle.getColour());
			System.out.println("Wheels: "+vehicle.getWheels());
			System.out.println("Engine CC"+vehicle.getEngineCC());
			System.out.println("\n");
		}
		
		
		
		myGarage.addVehicle(hellsAngel);
		
		
		for (Vehicle vehicle : myCars) {
			System.out.println("Make: "+vehicle.getMake());
			System.out.println("Colour: "+vehicle.getColour());
			System.out.println("Wheels: "+vehicle.getWheels());
			System.out.println("Engine CC"+vehicle.getEngineCC());
			System.out.println("\n");
		}
		
		System.out.println("Bill = £"+myGarage.calculateBill());
		
		myGarage.removeVehicle("HIB");
		
		
		System.out.println("\nUpdated List\n");
		
		for (Vehicle vehicle : myCars) {
			System.out.println("Make: "+vehicle.getMake());
			System.out.println("Colour: "+vehicle.getColour());
			System.out.println("Wheels: "+vehicle.getWheels());
			System.out.println("Engine CC"+vehicle.getEngineCC());
			System.out.println("\n");
		}
		
		System.out.println("Bill = £"+myGarage.calculateBill());

	}

}
