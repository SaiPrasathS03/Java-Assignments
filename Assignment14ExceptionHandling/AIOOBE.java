package com.zoho;

public class AIOOBE {

	public static void main(String[] args) {
		
		try {
			System.out.println(args[0]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is out of the length of the array");
			System.out.println(e.getMessage());
		}

	}

}
