package com.example.ashwinikb;

import org.junit.Test;

public class RemoveDuplicatesTest {
	@Test
	public void duplicates() {
		int[] array = {1,2,3,3,4,5,6,6,7,8,9};
		int n = RemoveDuplicates.removeDuplicates(array);
		for(int i =0; i < n;i++) {
			System.out.print(array[i] + " ");
		}
	}

}
