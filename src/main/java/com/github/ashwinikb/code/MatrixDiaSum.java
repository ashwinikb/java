/**
 * 
 */
package com.github.ashwinikb.code;

/**
 * @author ashwini
 *
 */
public class MatrixDiaSum {
	public static void main(String[] args) {
		int [][]a = { { 1, 2, 3, 4 },
                		  { 5, 6, 7, 8 }, 
                		  { 1, 2, 3, 4 },
                		  { 5, 6, 7, 8 } };
		MatrixDiaSum.matrixSum(a,4);
		int [][]b = { { 2, 4, 6, 8,1 },
					  { 10, 12, 14, 16,2 }, 
					  { 2, 4, 6, 8,3 },
					  { 10, 12, 14, 16,4},
					  {2,4,6,8,5}};
		MatrixDiaSum.matrixSumDia(b,5);

	}
	
	public static void matrixSum (int[][] mat, int n) {
		int primaryDiagonal = 0, secondaryDiagonal = 0;		
		for(int i = 0; i< n; i++) {
			for(int j = 0; j< n; j++) {
				if(i == j) 
					primaryDiagonal += mat[i][j];
				//Excluding the middle element in the diagonal.
				if((i+j) == (n-1)) 
					secondaryDiagonal += mat[i][j];
			}
		}
			System.out.println(primaryDiagonal);
			System.out.println(secondaryDiagonal);
		
	}
	
	public static void matrixSumDia (int[][] mat, int n) {
		int primaryDiagonal = 0, secondaryDiagonal = 0;		
		for(int i =0;i<n;i++) {
			primaryDiagonal += mat[i][i];
			if(i != n-i-1)
			secondaryDiagonal += mat[i][n-i-1];
		}
		System.out.println(primaryDiagonal);
		System.out.println(secondaryDiagonal);
	
	}
}
