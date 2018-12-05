package com.github.ashwinikb.code;

import org.junit.Test;

public class pairArrayTest {

    @Test
    public void pairSumTest(){
        int[] array = {4, 6, 5, -10, 8, 5, 20};
        int digit = 10;

        PairsWithSum.pairArray(array,digit);
    }
}
