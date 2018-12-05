package com.github.ashwinikb.code;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class SecondLargestTest {

    @Test
    public void largestTest(){
        int[] array = {32,45,63,21,18};
        int result = SecondLargest.largest(array);
        assertEquals(45,result);

    }
}
