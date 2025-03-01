package com.zoho;

import java.util.Scanner;

public class ValidEmail4 {
//	4. Write a program to validate email address (contains @ and proper domain format). Note: Don't use regular expressions

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isEmail(s));
	}

private static boolean isEmail(String s) {
	
		int indexAt = s.indexOf('@');
		int indLast=s.lastIndexOf('@');
		int indexDot = s.lastIndexOf('.');
		if(indexAt==-1 || indexAt==0 || indexAt==s.length()-1 || indexAt!=indLast || s.charAt(indexAt+1)=='.' || indexDot==-1 || indexDot==s.length()-1 || indexDot<indexAt || s.charAt(indexAt-1)=='.') return false;
		return true; 
}
	

}
