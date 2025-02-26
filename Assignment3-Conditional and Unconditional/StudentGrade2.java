package com.zoho;

import java.util.Scanner;

public class StudentGrade2 {
//	2. Create a program that takes a student's score as input and outputs their corresponding grade.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		if(mark>=91 && mark<=100) System.out.println("Grade A");
		else if(mark>=81 && mark<=90) System.out.println("Grade B");
		else if(mark>=71 && mark<=80) System.out.println("Grade C");
		else if(mark>=61 && mark<=70) System.out.println("Grade D");
		else if(mark>=50 && mark<=60) System.out.println("Grade E");
		else System.out.println("Fail");
	}
}
