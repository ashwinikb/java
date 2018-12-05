package com.github.ashwinikb.code;

public class MatrixOperations {

    public static int[][] addition(int[][] matA, int[][] matB){
        int p = matA.length;
        int q = matA[0].length;
        int[][] result = new int[p][q];
        for(int i = 0; i < p; i++){
            for(int j = 0; j < q; j++){
                result[i][j] = matA[i][j] + matB[i][j];
            }
        }
        return result;
    }

    public static int[][] subtraction(int[][] matA, int[][] matB){
        int p = matA.length;
        int q = matA[0].length;
        int[][] result = new int[p][q];
        for(int i = 0; i < p; i++){
            for(int j = 0; j < q; j++){
                result[i][j] = matA[i][j] - matB[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplication(int[][] matA, int[][] matB){
        int p = matA.length;
        int q = matA[0].length;
        int[][] result = new int[p][q];
        for(int i = 0; i < p; i++){
            for(int j = 0; j < q; j++){
                result[i][j] = matA[i][j] * matB[i][j];
            }
        }
        return result;
    }

}
