package com.github.ashwinikb.code;

import java.util.Arrays;

public class MoveZeros {

    public static void move(int[] array){
        int j = 0;
        for(int i = 0; i < array.length;i++){
            if(array[i] != 0){
                array[j] = array[i];
                j++;
            }
        }
        while (j < array.length)
        {
            array[j] = 0;

            j++;
        }
        System.out.println(Arrays.toString(array));
    }
}
