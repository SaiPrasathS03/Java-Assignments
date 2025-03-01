package com.zoho;

import java.util.Scanner;

public class StringReverse2 {
//	2. Write a program to reverse the characters of a string.
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder res = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			res.append(str.charAt(i));
		}
		System.out.println(res.toString());
	}

}
