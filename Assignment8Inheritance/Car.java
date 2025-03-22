package com.zoho;

public class Car extends Vehicle{

	private String carName;
	private String carColour;
	private int numberOfDoors;
	private int loadCapacity;
	
	
	public Car(String carName, String carColour, int numberOfDoors, int loadCapacity) {
		super(carName,carColour);
		this.numberOfDoors = numberOfDoors;
		this.loadCapacity = loadCapacity;
	}

	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void drive() {
		System.out.println("Driving Car!");
	}

	
	public void getLoadCapacity() {
		System.out.println(this.loadCapacity);
	}
	
	public void getNumberOfDoors() {
		System.out.println(this.numberOfDoors);
	}

	@Override
	public void displayDetails() {
		System.out.println("Car Details: ");
		System.out.println("Car Name: "+getVehicleName());
		System.out.println("Car Colour: "+getVehicleColour());
		System.out.println("Load Capacity: "+this.loadCapacity);
		System.out.println("Number Of Doors: "+this.numberOfDoors);
	}
	
}
