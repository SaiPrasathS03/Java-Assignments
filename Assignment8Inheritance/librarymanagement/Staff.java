package com.zoho.librarymanagement;

public class Staff extends User{
	private String dept;

    public Staff(String name, String id, String dept) {
        super(name, id);
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void manageBooks() {
        System.out.println("Staff member " + getName() + " is managing books.");
    }
}
