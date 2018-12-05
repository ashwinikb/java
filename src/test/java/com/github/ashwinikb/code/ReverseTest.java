package com.example.ashwinikb;

import org.junit.Assert;
import org.junit.Test;

public class ReverseTest {
	
	@Test	
	public void reverseint() {
		int a= 345;
		int result = ReverseInteger.reverse(a);
		int expected = 543;
		Assert.assertEquals(expected, result);
		
	}

}
