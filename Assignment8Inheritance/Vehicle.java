package com.zoho;

public abstract class Vehicle {
	
	private String vehicleName;
	private String vehicleColour;
	
	
	public Vehicle(String vehicleName, String vehicleColour) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleColour = vehicleColour;
	}
	
	public abstract void start();
	public abstract void drive();
	public abstract void displayDetails();

	public String getVehicleName() {
		return vehicleName;
	}


	public String getVehicleColour() {
		return vehicleColour;
	}

	
	
}
