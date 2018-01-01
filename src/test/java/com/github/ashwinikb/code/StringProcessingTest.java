package com.github.ashwinikb.code;

import org.junit.Test;

public class StringProcessingTest {
	
	
	@Test
	public void test() {
		String input = "12 some text 3  7";
		String result = StringProcessing.getSumOfString(input);
		
		System.out.println(result);
		
		
	}

}
