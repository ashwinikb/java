package com.example.ashwinikb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingNumberTest {
	
	@Test
	public void test() {
		int[] array = {1,2,3,4,5,7,8};
		int result = MissingNumber.number(array);
		assertEquals(6,result);
	}

}
