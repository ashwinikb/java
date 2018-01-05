package com.github.ashwinikb.code;

import org.junit.Assert;
import org.junit.Test;


public class PalindromeTest {
	
	@Test
	public void isPalindromeTest() {
		String input ="abcbae";
		boolean result = Palindrome.isPalindrome(input);
		Assert.assertEquals(false, result);
		System.out.println(result);
		
	}
	
	@Test
	public void isPalindromeTest1() {
		String input ="abcba";
		boolean result = Palindrome.isPalindrome(input);
		Assert.assertEquals(true, result);
		System.out.println(result);
		
	}
	
	@Test
	public void isPalindromeTest2() {
		String input ="abccba";
		boolean result = Palindrome.isPalindrome(input);
		Assert.assertEquals(true, result);
		System.out.println(result);
		
	}

}
