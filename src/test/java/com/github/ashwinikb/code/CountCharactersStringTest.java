package com.example.ashwinikb;

import org.junit.Test;

public class CountCharactersStringTest {
	
	@Test
	public void test() {
		String s = "hello world";
		CountCharactersString.findDuplicateCharacters(s);
	}
	
	@Test
	public void testString() {
		String s = "hello people hello world hello there hello friend hello earth hello world hello there hello friend";
		CountCharactersString.findDuplicateWords(s, "hello");
	}

}
