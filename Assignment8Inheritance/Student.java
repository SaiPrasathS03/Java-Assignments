package com.zoho;

public class Student {
	
	private String name;
	private int age;
	private String studentId;
	
	public Student() {
		this.name = "Unknown";
		this.age = 0;
		this.studentId = "N/A";
	}
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
		this.studentId = "N/A";
	}
	public Student(String name,int age,String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}

}
