package com.example.ashwinikb;

import org.junit.Test;

public class DuplicateStringSentenceTest {
	
	@Test
	public void test() {
		String s = "i code i eat i sleep";
			//Uniques : [code eat sleep]
			//Duplicates : [i]
		 DuplicateStringSentence.duplicate(s);
		 
	}

}
