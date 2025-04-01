package com.zoho.vehicle;

public class Car extends Vehicle{
	String carName;
	String carColour;
	
	public Car(String carName, String carColour) {
		super(carName,carColour);
	}
	
	public void start() {
		System.out.println("Car started...");
	}
	public void stop() {
		System.out.println("Car stopped...");
	}
}
