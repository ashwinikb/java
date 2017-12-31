package com.github.ashwinikb.code;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SumOfIntegersTest {

	@Test
	public void test() {

		String s = "12 some text 3  7";
		int sumOfNumbers = SumOfIntegers.getSumOfNumbers(s);
		assertEquals(22, sumOfNumbers);
		System.out.println(sumOfNumbers);

	}

}
