package com.example.ashwinikb;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Set;

import org.junit.Test;

public class DuplicateTest {
	
	@Test
	public void test() {
		int array[] = {1,2,3,4,2,5,6,7,8,6};
		Set<Integer> result = Duplicate.duplicateInt(array);
		Set<Integer> expected = {1,2,3,4,5,6,7,8};
		assertEquals(expected,result);
		
	}

}
