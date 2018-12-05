package com.github.ashwinikb.code;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReverseStringWithSpacesTest {

    @Test
    public void test(){
        String s = "I Am String";
        String result = ReverseStringWithSpaces.reverse(s);
        String expected = "g ni rtSmAI";
        assertEquals(expected, result);
    }
}
