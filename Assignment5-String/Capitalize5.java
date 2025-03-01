package com.zoho;

import java.util.Scanner;

public class Capitalize5 {
//	5. Write a program to capitalize the first letter of each words in a sentence.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder res = new StringBuilder();
		res.append(Character.toUpperCase(s.charAt(0)));
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				res.append(" "+Character.toUpperCase(s.charAt(++i)));
			}
			else {
				res.append(s.charAt(i));
			}
		}
		System.out.println(res.toString());
	}

}
