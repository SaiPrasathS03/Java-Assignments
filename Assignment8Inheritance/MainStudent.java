package com.zoho;

public class MainStudent {

	public static void main(String[] args) {
		
		Student stud1 = new Student("Sai",21,"568");
		stud1.displayDetails();
		
		ZsgsStudent stud2 = new ZsgsStudent("Prasath",21,"567","BE");
		stud2.displayDetails();
		
		Student stud3 = new ZsgsStudent("Sai",21,"567","BE");
		stud3.displayDetails();
	}

}
