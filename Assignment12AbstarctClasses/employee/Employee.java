package com.zoho.employee;

public abstract class Employee {
	static int id=1;
	String empName;
	String dept;
	int empId;
	 
	public Employee(String empName, String dept) {
		
		this.empName = empName;
		this.dept = dept;
		this.empId = empId;
	}
	public String getEmployeeDetails() {
		return "Employee [Id= " + empId+", empName= " + empName + ", dept= " + dept + "]";
	}
	public abstract int calculatePay();
}
