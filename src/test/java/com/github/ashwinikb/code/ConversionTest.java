package com.github.ashwinikb.code;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConversionTest {

    @Test
    public void binaryTest(){
        int number = 1645;
        String result = Conversion.binary(number);
        String expected = "11001101101";
        assertEquals(expected, result);
    }

    @Test
    public void hexaDecimalTest(){
        int number = 1645;
        String result = Conversion.hexaDecimal(number);
        String expected = "66D";
        assertEquals(expected, result);
    }

    @Test
    public void octalTest(){
        int number = 1645;
        String result = Conversion.octal(number);
        String expected = "3155";
        assertEquals(expected, result);
    }
}
