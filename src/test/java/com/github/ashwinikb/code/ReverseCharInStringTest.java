package com.github.ashwinikb.code;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReverseCharInStringTest {

    @Test
    public void test(){
        String s = "Java concept of the day";
        String result = ReverseCharInString.reverse(s);
        String expected = "avaJ tpecnoc fo eht yad";
        assertEquals(expected, result);
    }
}
