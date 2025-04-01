package com.zoho.employee;

public class Employee {
	static int id=1;
	String empName;
	String dept;
	int empId;
	 
	 public Employee(String empName, String dept) {
		 this.empId = id++;
		 this.empName = empName;
		 this.dept = dept;
	 }
	 
	public String getEmployeeDetails() {
		return "Employee [Id= " + empId+", empName= " + empName + ", dept= " + dept + "]";
	}

}
