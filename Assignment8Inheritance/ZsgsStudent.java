package com.zoho;

public class ZsgsStudent extends Student{
	private String degree;
	
	public ZsgsStudent() {
		super();
		this.degree = "Unknown";
	}
	public ZsgsStudent(String name,int age,String degree) {
		super(name,age);
		this.degree = degree;
	}
	public ZsgsStudent(String name,int age,String studentId,String degree) {
		super(name,age,studentId);
		this.degree = degree;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Degree: "+degree);
	}
}