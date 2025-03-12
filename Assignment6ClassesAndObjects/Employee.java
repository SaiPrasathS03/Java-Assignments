package com.zoho;

public class Employee {

	private static int empId=1;
	private String empName;
	private String dept;
	private int salary;
	
	public Employee(String empName, String dept, int salary) {
		this.empId = empId++;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [Id= " + empId+"empName= " + empName + ", dept= " + dept + ", salary= " + salary + "]";
	}
	
	
}
