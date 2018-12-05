package com.example.ashwinikb;

import org.junit.Assert;
import org.junit.Test;

public class StringSpacesTest {
	
	@Test
	public void stringTest() {
		String s = "Hi pe op le  how a re yo u";
		String result = StringSpaces.spaceRemoval(s);
		String expected = "Hipeoplehowareyou";
		Assert.assertEquals("Answer", expected, result);
		
	}
	
	@Test
	public void stringTest1() {
		String s = "Hi pe op le  how a re yo u";
		StringBuffer result = StringSpaces.spaceRemovalAnother(s);
		String expected = "Hipeoplehowareyou";
		Assert.assertEquals(expected.toString(), result.toString());
		
	}


}
