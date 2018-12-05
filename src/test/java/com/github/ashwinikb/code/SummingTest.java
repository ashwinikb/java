package com.github.ashwinikb.code;

import org.apache.logging.log4j.LogManager;
import org.junit.BeforeClass;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class SummingTest {

    @Test
    public void test(){
        int num = 5555;
        int sum = Summing.sumArray(num);
        assertEquals(15,sum);
    }
}
