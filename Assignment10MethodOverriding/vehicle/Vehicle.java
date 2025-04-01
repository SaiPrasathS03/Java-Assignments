package com.zoho.vehicle;

public class Vehicle {
	String vehicleName;
	String vehicleColour;
	
	public Vehicle(String vehicleName, String vehicleColour) {
		this.vehicleName = vehicleName;
		this.vehicleColour=vehicleColour;
	}
	
	public void start() {
		System.out.println(vehicleName+" started...");
	}
	public void stop() {
		System.out.println(vehicleName+" stopped...");
	}
}
