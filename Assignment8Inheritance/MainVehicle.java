package com.zoho;

public class MainVehicle {

	public static void main(String[] args) {
		Vehicle car = new Car("Swift","Red",7,4);
		Bike bike = new Bike("Max100","Blue",100);
		bike.displayDetails();
		car.displayDetails();
		car.drive();
		bike.start();
	}

}
