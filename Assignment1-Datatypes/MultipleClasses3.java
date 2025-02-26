package com.zoho;

public class MultipleClasses3 {

	public static void main(String[] args) {
		System.out.println(new Class1().printMessage1());
		System.out.println(new Class2().printMessage2());
	}
}

class Class1{
	public String printMessage1() {
		return "Class1";
	}
}

class Class2{
	public String printMessage2() {
		return "Class2";
	}
}
