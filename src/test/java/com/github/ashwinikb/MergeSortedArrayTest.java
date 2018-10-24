package com.example.ashwinikb;

import org.junit.Test;

public class MergeSortedArrayTest {
	
	@Test
	public void test() {
		int[] array1 = {1, 3, 5, 7};
		int[] array2 = {2, 4, 6, 8};
		int n1 = array1.length;
		int n2 = array2.length;
		int[] array3 = new int[n1+n2]; 
		array3 = MergeSortedArray.merge(array1, array2, array3);
		for(int i = 0; i< array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
	}

}
