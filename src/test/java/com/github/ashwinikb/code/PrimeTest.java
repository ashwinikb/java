package com.example.ashwinikb;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeTest {
	
	@Test
	public void test() {
		int num = 21;
		boolean result = PrimeNumber.prime(num);
		assertTrue(result);
	}

}
