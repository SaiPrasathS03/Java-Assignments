package com.zoho;
import java.util.Scanner;

public class CountVowels1 {
//	1. Create a program to count vowels in a given string using string functions

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int count=0;
		String s = sc.nextLine();
		String vowel = "aeiouAeiou";
		for(int i=0;i<s.length();i++) {
			if(vowel.indexOf(s.charAt(i))!=-1) {
				count++;
			}
		}
		System.out.println(count);
	}
}
