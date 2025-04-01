package com.zoho.librarymanagement;

public class Student extends User{
	 private String studentClass;

	    public Student(String name, String id, String studentClass) {
	        super(name, id);
	        this.studentClass = studentClass;
	    }

	    public String getStudentClass() {
	        return studentClass;
	    }

	    public void setStudentClass(String studentClass) {
	        this.studentClass = studentClass;
	    }
	    public void borrowBook() {
	        System.out.println("Student " + getName() + " is borrowing a book.");
	    }
}
