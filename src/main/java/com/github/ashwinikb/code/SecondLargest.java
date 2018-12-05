package com.github.ashwinikb.code;

public class SecondLargest {

    public static int largest(int[] array){
        int max1 = 0;
        int max2 = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > max1){
                max2 = max1;
                max1 = array[i];
            }else if(array[i] > max2){
                max2 = array[i];
            }
        }
        return max2;

    }
}
