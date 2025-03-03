package com.zoho;

public class MatrixMultiplication3 {
	public static void main(String[] args) {
		int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] mat2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		int row1 = mat1.length;
		int col1 = mat1[0].length;
		int row2 = mat2.length;
		int col2 = mat2[0].length;
		
		if(col1!=row2) {
			System.out.println("Matrix Multiplication is not possible");
			System.exit(0);
		}
		
		int[][] res = new int[row1][col2];
		
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				res[i][j] = 0;
				for(int k=0;k<row2;k++) {
					res[i][j]+=mat1[i][k]*mat2[k][j];
				}
			}
		}
		
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
