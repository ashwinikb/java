package com.github.ashwinikb.code;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class StringCountTest {
	
	@Test
	public void test() {
		String s = "some text";
		int count = StringCount.countWords(s);
		assertEquals(2,count);
		System.out.println(count);
		
	}
	
	@Test
	public void test1() {
		String s = "12 some text 54 of words";
		int count = StringCount.countWords(s);
		assertEquals(4,count);
		System.out.println(count);
		
	}

}
