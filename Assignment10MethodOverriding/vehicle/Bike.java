package com.zoho.vehicle;

public class Bike extends Vehicle{
	String bikeName;
	String bikeColour;
	
	public Bike(String bikeName, String bikeColour) {
		super(bikeName,bikeColour);
	}
	
	public void start() {
		System.out.println("Bike started...");
	}
	public void stop() {
		System.out.println("Bike stopped...");
	}
}
