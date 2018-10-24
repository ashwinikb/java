package com.ashwinikb.sortingtest;


import org.junit.Assert;
import org.junit.Test;

import com.ashwinikb.sorting.BubbleSort;

public class BubbleSortTest {
	
	@Test
	public void bubbleTest1() {
		int[] array = {100,20,15,30,5,75,40};
		int[] result = BubbleSort.array(array);
		int[] expected = {5,15,20,30,40,75,100};
		Assert.assertArrayEquals(expected, result);
		
	}

}
