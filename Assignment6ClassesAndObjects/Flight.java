package com.zoho;

import java.time.LocalDateTime;

public class Flight {
	private static int flightId=1;
	private String departureLocation;
	private String arrivalLocation;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	
	public Flight(String departureLocation, String arrivalLocation, LocalDateTime departureTime,
			LocalDateTime arrivalTime) {
		super();
		this.flightId = flightId++;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	public String getDepartureLocation() {
		return departureLocation;
	}
	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}
	public String getArrivalLocation() {
		return arrivalLocation;
	}
	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	@Override
	public String toString() {
		return "Flight [Id= " + flightId+"departureLocation= " + departureLocation + ", arrivalLocation= " + arrivalLocation
				+ ", departureTime= " + departureTime + ", arrivalTime= " + arrivalTime + "]";
	}
	
	
}
