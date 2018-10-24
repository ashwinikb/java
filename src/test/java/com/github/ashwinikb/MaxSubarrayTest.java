package com.example.ashwinikb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSubarrayTest {
	
	@Test
	public void maxArrayTest() {
		int[] arr = {1,2,-3,2,4,-1,6,-3,-2};
		int result = MaxSubarray.array(arr);
		assertEquals(11,result);
		
		
	}

}
