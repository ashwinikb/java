package com.example.ashwinikb;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrequencyCountTest {
	
	@Test
	public void test() {
		String s = "hello how are you hello world hello people hello kids";
		String word = "hello";
		
		int count = FrequencyCount.wordCount(s, word);
		assertEquals(4, count);
	}

}
