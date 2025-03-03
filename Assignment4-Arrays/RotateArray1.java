package com.zoho;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray1 {
//	Create a program that rotates the elements of an array to the right by a specified number of positions. Get the array and the rotation count from the user
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {0,1,2,3,4,5,6};
		int rot = sc.nextInt();
		int n=arr.length;
//		int index=0;
//		int[] res = new int[arr.length];
//		for(int i=n-rot;i<arr.length;i++) {
//			res[index++] = arr[i];
//		}
//		for(int i=0;i<n-rot;i++) {
//			res[index++] = arr[i];
//		}
//		
		for(int i=0;i<rot%n;i++) {
			int temp = arr[arr.length-1];
			for(int j=arr.length-1;j>=1;j--) {
				arr[j]=arr[j-1];
			}
			arr[0] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
