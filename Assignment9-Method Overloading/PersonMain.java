package com.zoho;

class Person {
	private String name;
	private int age=20;
	private String address="No Address";
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name,int age,String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
}

public class PersonMain{
	public static void main(String[] args) {
		Person person = new Person("Ravi");
		Person person1 = new Person("Ravindran",50);
		Person person2 = new Person("Ravichandran",30,"No.10,Dubai Main Road,Dubai");
		
		System.out.println(person2.toString());
	}
}
