package com.zoho.sort;

import java.util.Arrays;
import java.util.Scanner;

public class MainSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop=true;
		while(loop) {
			System.out.println("Select the Sorting Algorithm: \n1. Bubble Sort\n2. Quick Sort\n3. Merge Sort\n4.Exit");
			int choice = sc.nextInt();
			System.out.println("Enter the array size: ");
			int size = sc.nextInt();
			System.out.println("Enter the array elements: ");
			int[] arr =new int[size];
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			Sortable sortObj = null;
			switch(choice) {
			case 1:
				sortObj = SortFactory.createSort("bubbleSort");
				break;
			case 2:
				sortObj = SortFactory.createSort("quickSort");
				break;
			case 3:
				sortObj = SortFactory.createSort("mergeSort");
				break;
			case 4:
				loop=false;
			}
			sortObj.sort(arr);
			System.out.println(Arrays.toString(arr));
			
		}
	}

}
