package com.ashwinikb.sortingtest;

import org.junit.Assert;
import org.junit.Test;

import com.ashwinikb.sorting.SelectionSorting;

public class SelectionSortTest {
	
	@Test
	public void selectionTest() {
		int[] array = {40,10,-30,45,39,32};
		int[] result = SelectionSorting.select(array);
		int[] expected = {-30, 10, 32, 39, 40, 45};
		Assert.assertArrayEquals(expected, result);
	}

}
