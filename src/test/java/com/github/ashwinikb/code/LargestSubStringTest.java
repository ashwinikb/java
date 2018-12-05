package com.example.ashwinikb;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

public class LargestSubStringTest {
	
	@Test
	public void test() {
		String s = "abcdabacd";
		int result = LargestSubString.subStringLargest(s);
		assertEquals(4,result);
		
	}

}
