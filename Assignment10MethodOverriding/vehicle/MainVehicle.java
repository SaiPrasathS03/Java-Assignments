package com.zoho.vehicle;

public class MainVehicle {

	public static void main(String[] args) {
		Vehicle v = new Vehicle("Lorry","Brown");
		Vehicle b = new Bike("Max100","Blue");
		Vehicle c = new Car("Maruti800","Green");
		v.start();
		v.stop();
		b.start();
		b.stop();
		c.start();
		c.stop();
	}

}
