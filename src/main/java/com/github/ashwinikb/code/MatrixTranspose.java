package com.example.ashwinikb;

public class Matrixtranspose {
	public static void main(String[] args) {
		int[][] array = {{1,2,3,4},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
		int N = 4;
		int[][] transposeArray = new int[N][N];
		int i,j;
		Matrixtranspose.transpose(array,transposeArray);
		System.out.print("Result matrix is \n");
        for (i = 0; i < N; i++)
        {
            for (j = 0; j < N; j++)
            System.out.print(transposeArray[i][j] + " ");
            System.out.print("\n");
        }
        
        double[][] array1 = {{1,2,3},{4,5,6},{8,9,10},{12,13,14}};
        int P = array1[0].length;
        int Q = array1.length;
		int m,n;
		double[][] B = Matrixtranspose.transposeMatrix(array1);
		System.out.print("Result matrix is \n");
        for (m = 0; m < P; m++)
        {
            for (n = 0; n < Q; n++)
            System.out.print(B[m][n] + " ");
            System.out.print("\n");
        }
	}
	public static void transpose(int[][] A, int[][] B) {
		int N = A.length;
		for(int i=0;i<N;i++) {
			for(int j =0;j<N;j++) {
				B[i][j] = A[j][i];
			}
		}
	}

	public static double[][] transposeMatrix(double arr[][]){
	    int m = arr.length;
	    int n = arr[0].length;
	    double ret[][] = new double[n][m];

	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            ret[j][i] = arr[i][j];
	        }
	    }

	    return ret;
	}

}
