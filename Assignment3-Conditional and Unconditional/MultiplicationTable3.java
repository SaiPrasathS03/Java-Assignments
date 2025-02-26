package com.zoho;

import java.util.Scanner;

public class MultiplicationTable3 {
//	3. Write a program to print multiplication table of a given number in a neat format

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
}
