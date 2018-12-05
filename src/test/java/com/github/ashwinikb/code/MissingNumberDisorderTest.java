package com.example.ashwinikb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingNumberDisorderTest {
	
	@Test
	public void test() {
		int[] a = {1, 2, 4, 6, 3, 7, 8}; 
        int miss = MissingNumberDisorder.getMissingNo(a, 7); 
        assertEquals(5,miss);
}
	@Test
	public void test1() {
		int[] a = {1, 2, 4, 8, 3, 7, 5}; 
        int miss = MissingNumberDisorder.missingNum(a); 
        assertEquals(6,miss);
}

}
