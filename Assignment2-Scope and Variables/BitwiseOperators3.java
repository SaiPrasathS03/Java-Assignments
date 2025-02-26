package com.zoho;

import java.util.Scanner;

public class BitwiseOperators3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("a&b"+(a&b));
		System.out.println("a|b: "+(a|b));
		System.out.println("a^b: "+(a^b));
		System.out.println("~a: "+(~a));
		System.out.println("a>>2: "+(a>>2));
		System.out.println("a>>>2: "+(a>>>2));
		System.out.println("a<<2: "+(a<<2));
		
	}
}
