package com.github.ashwinikb.code;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckingBinaryTest {

    @Test
    public void binaryTest(){
        int num = 2056789;
        boolean result = CheckingBinary.binary(num);
        assertFalse(result);
    }

    @Test
    public void binaryTest1(){
        int num = 1058;
        boolean result = CheckingBinary.binary(num);
        assertFalse(result);
    }

    @Test
    public void binaryTest2(){
        int num = 10110;
        boolean result = CheckingBinary.binary(num);
        assertTrue(result);
    }
}

