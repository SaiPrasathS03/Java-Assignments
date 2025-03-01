package com.zoho;

import java.util.Scanner;

public class WordReverse3 {
//	3. Write a program to reverse the words in a sentence.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.split(" ");
		StringBuilder res = new StringBuilder();
		
		for(int i=words.length-1;i>0;i--) {
			res.append(words[i]+" ");
		}
		res.append(words[0]);
		System.out.println(res);
		
	}

}
