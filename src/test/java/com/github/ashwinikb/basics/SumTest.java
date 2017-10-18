package com.github.ashwinikb.basics;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.github.ashwinikb.basics.Sum;

/**
 * @author Ashwini KB
 */

public class SumTest {

	@Test
	public void testSum() {
		int result = Sum.add(5, 5);
		assertEquals(10, result);
		System.out.println("Result : " + result);
	}
	
	@Test
	public void testSumNegativeNum() {
		int result = Sum.add(-5,3);
		assertEquals(-2, result);
		System.out.println("Result : " + result);
	}

}