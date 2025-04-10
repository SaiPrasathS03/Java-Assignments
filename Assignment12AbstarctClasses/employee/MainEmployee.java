package com.zoho.employee;

public class MainEmployee {

	public static void main(String[] args) {
		Employee emp1 = new SalariedEmployee("Sai", "Dev",60000);
		System.out.println(emp1.getEmployeeDetails());
		Employee emp2 = new HourlyEmployee("Gogul", "Dev",60,5000);
		System.out.println(emp2.getEmployeeDetails());
		System.out.println(emp2.calculatePay());
	}
}
