package com.ashwinikb.sorting;

public class BubbleSort {

	public static int[] array(int[] array) {
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array.length-1-i; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
		
	}
}
