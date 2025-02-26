package com.zoho;
import java.util.Scanner;

public class CelciusToFarenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Celcius: ");
		double celcius = sc.nextDouble();
		double farenheit = ((9.0/5.0)*celcius)+32;
		System.out.println(farenheit);
	}

}
