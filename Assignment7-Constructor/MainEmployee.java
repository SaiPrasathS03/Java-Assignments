package com.zoho;

public class MainEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("Mukesh" , "MTS", 150000);
		Employee e2 = new Employee("Gurusamy" , "MTS", 150001);
		Employee e3 = new Employee("Dhinesh" , "HR", 150000);
		
		e1.addEmployee(e1);
		e2.addEmployee(e2);
		e3.addEmployee(e3);
		
		Employee.displayAll();
	}

}
