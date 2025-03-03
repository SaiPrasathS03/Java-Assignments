package com.zoho;

import java.util.Scanner;

public class SpiralMatrix4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] res = new int[n][n];
		int top=0,bottom=n-1,left=0,right=n-1;
		int value=1;
		while(top<=bottom && left<=right) {
			
			for(int i=left;i<=right;i++) {
				res[top][i] = value++;
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				res[i][right] = value++;
			}
			right--;
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					res[bottom][i] = value++;
				}
				bottom--;
			}
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					res[i][left] = value++;
				}
				left++;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
	}

}
