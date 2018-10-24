package com.ashwinikb.sorting;

public class InsertionSorting {
	public static int[] sort(int[] array) {
		for(int i = 1;i<array.length;i++) {
			int sortValue = array[i];
			int j;
			for( j = i;j>0&&array[j-1]>sortValue;j--) {
				
				array[j] = array[j-1];
			}
			array[j] = sortValue;
		}
		return array;
	}

}
