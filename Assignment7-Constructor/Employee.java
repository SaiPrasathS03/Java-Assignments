package com.zoho;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private static int empId=1;
	private int id;
	private String empName;
	private String dept;
	private int salary;
	
	static List<Employee> empList = new ArrayList<>();
	
	public Employee(String empName, String dept, int salary) {
		this.id = empId++;
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

	public void addEmployee(Employee e) {
		empList.add(e);
	}
	public static void displayAll() {
		for(Employee e:empList) {
			System.out.println(e);
		}
	}

	@Override
	public String toString() {
		return "Employee [Id= " + id+", empName= " + empName + ", dept= " + dept + ", salary= " + salary + "]";
	}


	
	
	
}
