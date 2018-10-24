package com.example.ashwinikb;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringAnagramTest {
	
	@Test
	public void test() {
		String word = "silent";
		String anagram = "listen";
		boolean result = StringAnagram.anagram(word, anagram);
		assertTrue(result);
		
	}
	

}
