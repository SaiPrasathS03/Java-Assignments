package com.zoho;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of persons: ");
		int n = sc.nextInt();
		int[][] jagged = new int[n][];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter number of weights of person"+i+": ");
			int w = sc.nextInt();
			jagged[i] = new int[w];
		}
		
		while(true) {
			System.out.println("Enter choice\n1. Add Weight\n2. Minimum weight of the nth person\n");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("Enter the Person index:");
				int pInd = sc.nextInt();
				System.out.println("Enter the Weight index:");
				int wInd = sc.nextInt();
				System.out.println("Enter the Weight:");
				int weight1 = sc.nextInt();
				addWeight(jagged,pInd,wInd,weight1);
				break;
			
			case 2:
				System.out.println("Enter the Person index to get the minimum weight: ");
				int pIndex = sc.nextInt();
				
				if(pIndex<n) minimumWeight(jagged[pIndex]);
				else System.out.println("No Such Index");
				break;
			}
		}
	}

	public static void addWeight(int[][] jaggedArray, int pInd, int wInd, int weight) {
        if (pInd >= 0 && pInd < jaggedArray.length && wInd >= 0 && wInd < jaggedArray[pInd].length) {
            jaggedArray[pInd][wInd] = weight;
        }
        else {
            System.out.println("Invalid index! Please check the person index and weight index.");
        }
    }
	
	public static void minimumWeight(int[] pWeights) {
        int minWeight = pWeights[0]; 
        
        for (int i = 1; i < pWeights.length; i++) {
            if (pWeights[i] < minWeight) {
                minWeight = pWeights[i];
            }
        }
        
        System.out.println(minWeight);
    }
}
