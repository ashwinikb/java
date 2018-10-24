package com.example.ashwinikb;

public class MatrixPosition {
	
	public static void position(int[][] mat, int n, int num) {
		for(int i = 0; i<n; i++) {
			for(int j = 0; j< n ; j++) {
				if(mat[i][j] == num) 
					System.out.println("indexes are : " + i + "," + j);
				
			}
		}
	}
	
	public static void main(String[] args) {
		int mat[][] = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50} };
		int n = 4;
		int num = 50;
		MatrixPosition.position(mat, n, num);
	}

}
