package com.zoho;

public class EvenSum6 {

	public static void main(String[] args) {
//		3. Write a program to find the sum of even numbers only in a given array. Use continue.

		int[] arr = {1,2,3,4,5,6,7,8,9};
		int evenSum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) continue;
			evenSum+=arr[i];
		}
		System.out.println(evenSum);
	}

}
