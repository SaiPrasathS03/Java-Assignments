package com.zoho;

import java.util.Scanner;

public class PrimeNumbers5 {
//	2. Write a program to print prime numbers between 1 to 30

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=30;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPrime(int i) {
		if(i<=1) return false;
		for(int j=2;j<i;j++) {
			if(i%j==0) return false;
		}
		
		return true;
	}
}
