package com.zoho;

public class Bike extends Vehicle{
	
	private String bikeName;
	private String bikeColour;
	private int cc;
	
	public Bike(String bikeName, String bikeColour, int cc) {
		super(bikeName,bikeColour);
		this.cc = cc;
	}

	@Override
	public void start() {
		System.out.println("Bike started");
	}

	@Override
	public void drive() {
		System.out.println("Driving Bike!");
	}

	
	public void getCC() {
		System.out.println(this.cc);
	}

	@Override
	public void displayDetails() {
		System.out.println("Car Details: ");
		System.out.println("Bike Name: "+getVehicleName());
		System.out.println("Bike Colour: "+getVehicleColour());
		System.out.println("Bike CC: "+this.cc);
	}
	
}
