package com.example.ashwinikb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DuplicateStringTest {

	@Test
	public void test() {
		String ch = "HelloworldHelloworld";
		char[] c = ch.toCharArray();
		char result = DuplicateCharacter.duplicate(c);
		
		assertEquals('l', result);
		
	}
	
}
