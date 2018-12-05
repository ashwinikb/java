package com.example.ashwinikb;

import org.junit.Test;

public class RemoveValueTest {

	@Test
	public void removeValue() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = RemoveValue.removeVal(array, 3);
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
