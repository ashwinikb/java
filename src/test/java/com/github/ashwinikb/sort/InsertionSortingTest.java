package com.ashwinikb.sortingtest;

import org.junit.Assert;
import org.junit.Test;

import com.ashwinikb.sorting.InsertionSorting;

public class InsertionSortingTest {
	
	@Test
	public void insertionTest() {
	int[] array = {100,20,15,30,5,75};
	int[] result = InsertionSorting.sort(array);
	int[] expected = {5,15,20,30,75,100};
	Assert.assertArrayEquals(expected, result);
	}

}
