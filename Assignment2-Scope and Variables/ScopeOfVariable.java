package com.zoho;

public class ScopeOfVariable {

	public static void main(String[] args) {
		int out = 10;
		if(true) {
			int in = 20;
			System.out.println("Outside "+out);
			System.out.println("Inside "+in);
		}
		System.out.println("Outside "+out);
//		System.out.println("Inside "+in); //Exception in thread "main" java.lang.Error: Unresolved compilation problem: in cannot be resolved to a variable

	}

}
