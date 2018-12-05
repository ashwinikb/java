package com.example.ashwinikb;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
	
	@Test
	public void reverse() {
		String s = "hello";
		String result = ReverseString.reverse(s);
		Assert.assertEquals("olleh", result);
		
	}

	@Test
	public void reverseSentest() {
		String s = "hello world ";
		String result = ReverseString.reverseSen(s);
		Assert.assertEquals("world hello", result);
		
	}

}
