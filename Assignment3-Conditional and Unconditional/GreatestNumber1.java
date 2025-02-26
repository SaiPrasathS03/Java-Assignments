package com.zoho;
import java.util.Scanner;

public class GreatestNumber1 {
//	1. Take three numbers from the user and print the greatest number.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is the greatest");
		}
		else if(b>c) {
			System.out.println(b+" is the greatest");
		}
		else {
			System.out.println(c+ " is the greatest");
		}
	}
}
