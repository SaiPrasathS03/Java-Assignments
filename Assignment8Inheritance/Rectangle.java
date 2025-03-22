package com.zoho;

public class Rectangle extends Shape{
	private double length;
	private double breadth;
	@Override
	public double area() {
		return length*breadth;
	}
	@Override
	public double perimeter() {
		return 2*(length+breadth);
	}
}
