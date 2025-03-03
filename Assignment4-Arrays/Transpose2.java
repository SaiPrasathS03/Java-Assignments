package com.zoho;

import java.util.Arrays;

public class Transpose2 {
//	2.Write a program to find transpose of a matrix
	public static void main(String[] args) {
		int[][] mat = {{1,2},{4,5},{7,8}};
		int[][] res = new int[2][3];
		int row=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<mat[0].length;i++) {
			int col=0;
			for(int j=0;j<mat.length;j++) {
				res[row][col++] = mat[j][i];
			}
			row++;
		}
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}

	}

}
