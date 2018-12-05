package com.example.ashwinikb;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromicSubStringTest {

	@Test
	public void isSubStringPalindromeTest() {
		PalindromicSubString pal = new PalindromicSubString();
		assertEquals("baba",pal.palindromicSub("bab"));
//		assertEquals("bab",pal.palindromicSub("baba"));
		assertEquals("baaab",pal.palindromicSub("babaaab"));
//		assertFalse(pal.isPalindrome("baba"));
	}

	
	@Test
	public void isPalindromeTest() {
		PalindromicSubString pal = new PalindromicSubString();
		assertTrue(pal.isPalindrome("bab"));
		assertFalse(pal.isPalindrome("baba"));
	}
}
