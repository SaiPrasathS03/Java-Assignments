package com.zoho.employee;

public class HourlyEmployee extends Employee{
	String empName;
	String dept;
	int hoursWorked;
	int hourlyRate;
	
	public HourlyEmployee(String empName, String dept,int hoursWorked,int hourlyRate) {
		super(empName,dept);
		this.hoursWorked=hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public String getEmployeeDetails() {
		return "Employee [Id= " + empId+", empName= " + empName + ", dept= " + dept + ", hoursWorked= " + hoursWorked+", hourlyRate= " + hourlyRate+"]";
	}

	@Override
	public int calculatePay() {	
		return hoursWorked*hourlyRate;
	}
}
