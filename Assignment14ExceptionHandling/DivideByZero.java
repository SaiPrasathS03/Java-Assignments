package com.zoho;

public class DivideByZero {

	public static void main(String[] args) {
		try {
			int var = 4/1;
			System.out.println(var);
			System.exit(0);
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide a number by zero");
		}
		finally {
			System.out.println("Program executed");
		}
	}

}
