package com.github.ashwinikb.code;

import org.junit.Test;

public class MatrixOperationsTest {

    @Test
    public void testAddition(){
        int[][] matB = {{1,2},{1,2},{1,2}};
        int[][] matA = {{6,4},{8,4},{5,1}};

        int[][] result = MatrixOperations.addition(matA,matB);

        int x = result.length;
        int y = result[0].length;

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.println(result[i][j] + " ");
            }
            System.out.println("\t");
        }
    }

    @Test
    public void testSubtraction(){
        int[][] matB = {{1,2},{1,2},{1,2}};
        int[][] matA = {{6,4},{8,4},{5,1}};

        int[][] result = MatrixOperations.subtraction(matA,matB);

        int x = result.length;
        int y = result[0].length;

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.println(result[i][j] + " ");
            }
            System.out.println("\t");
        }
    }

    @Test
    public void testMultiplication(){
        int[][] matB = {{1,2},{1,2},{1,2}};
        int[][] matA = {{6,4},{8,4},{5,1}};

        int[][] result = MatrixOperations.multiplication(matA,matB);

        int x = result.length;
        int y = result[0].length;

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.println(result[i][j] + " ");
            }
            System.out.println("\t");
        }
    }
}
