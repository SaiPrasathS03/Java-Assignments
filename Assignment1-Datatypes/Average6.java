package com.zoho;

public class Average6 {

	public static void main(String[] args) {
		int[] arr = {50,55,60,45,67,88,90,65,55,59};
		int sumOfWeights=0;
		for(int i=0;i<arr.length;i++) {
			sumOfWeights+=arr[i];
		}
		float avgOfTen = sumOfWeights/10;
		System.out.println(avgOfTen);
	}

}
