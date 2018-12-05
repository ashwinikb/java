package com.example.ashwinikb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInsertTest {
	
	@Test
	public void insertTest() {
		int[] nums = {1,3,4,5};
		int target = 8;
		int result = SearchInsert.search(nums, target);
		assertEquals(4,result);
	}

}
