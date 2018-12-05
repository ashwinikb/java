package com.github.ashwinikb.code;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ArrayEqualsTest {

    @Test
    public void test(){
        int[] array1 = {2, 5, 1, 7, 4, 3};
        int[] array2 = {2, 5, 1, 7, 4, 3};
        boolean result = ArrayEquals.equals(array1, array2);
        assertTrue(result);
    }

    @Test
    public void testString(){
        String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings","jsp"};
        boolean result = ArrayEquals.stringEquals(s1, s2);
        assertTrue(result);
    }

    @Test
    public void testMultiString(){
        String[][] s1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
        String[][] s2 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
        boolean result = ArrayEquals.stringEqualsMulti(s1, s2);
        assertTrue(result);
    }
}

