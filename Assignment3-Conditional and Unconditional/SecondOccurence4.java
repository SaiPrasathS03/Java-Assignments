package com.zoho;

import java.util.Scanner;

public class SecondOccurence4 {
//	1. Write a program to find second occurrence of a given number in an array

	public static void main(String[] args) {
		int[] arr = {4,1,5,6,80,9,1,6,5,1};
		Scanner sc = new Scanner(System.in);
		int index=0,count=0;
		int target = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				count++;
				index=i;
				if(count==2) break;
			}
		}
		System.out.println(index);
	}

}
