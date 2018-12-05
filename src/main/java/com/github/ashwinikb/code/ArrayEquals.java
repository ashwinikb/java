package com.github.ashwinikb.code;

import java.util.Arrays;

public class ArrayEquals {
    public static boolean equals(int[] array1, int[] array2) {
        boolean equalOrNot = true;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }
        return equalOrNot;
    }

    public static boolean stringEquals(String[] s1, String[] s2) {
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    }

    public static boolean stringEqualsMulti(String[][] s1, String[][] s2) {
        return Arrays.deepEquals(s1,s2);
    }
}





