package com.zoho;

import java.util.Scanner;

public class QuadraticEquation2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int d = (b*b)-(4*a*c);
		
		if(d>0) {
			double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
		}
		else if(d==0) {
			double root = -b / (2 * a);
            System.out.println("The root is real and repeated.");
            System.out.println("Root: " + root);
		}
		else {
			double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("The roots are complex and imaginary.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
		}
		
	}

}
