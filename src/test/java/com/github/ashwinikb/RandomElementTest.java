package com.example.ashwinikb;

import org.junit.Test;

public class RandomElementTest {
	
	@Test
	public void random(){
	int[] array = {34,65,98,56,25,69};
	int result = RandomElement.getRandom(array);
	System.out.println(result);
	}
}
