package com.zoho.employee;

public class SalariedEmployee extends Employee{
	 
	 int salary;
	
	public SalariedEmployee(String empName, String dept, int salary) {
		super(empName,dept);
		this.salary = salary;
	}
	
	public String getEmployeeDetails() {
		return "Employee [Id= " + empId+", empName= " + empName + ", dept= " + dept + ", salary= " + salary + "]";
	}
}
