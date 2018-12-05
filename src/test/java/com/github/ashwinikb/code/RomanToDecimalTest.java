package com.github.ashwinikb.code;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RomanToDecimalTest {

    @Test
    public void test(){
        int number = 1546;
        String result = RomanToDecimal.roman(number);
        String expected = "MDXLVI";
        assertEquals(expected, result);
    }
}
