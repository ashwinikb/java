package com.github.ashwinikb.code;

public class PairsWithSum {

    public static void pairArray(int[] array, int digit){

        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length;j++) {
                if(array[i]+array[j] == digit){
                    System.out.println("Pairs of the elements with sum equal to digit is :" + array[i] + " + "+array[j] + " = " + digit);
                }
            }
        }

    }
}
