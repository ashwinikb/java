package com.example.ashwinikb;

public class MergeSortedArray {
	public static int[] merge(int[] array1, int[] array2, int[] array3) {
		int n1 = array1.length;
		int n2 = array2.length;

		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (array1[i] < array2[j]) {
				array3[k++] = array1[i++];
			} else {
				array3[k++] = array2[j++];
			}
		}
		while (i < n1) {
			array3[k++] = array1[i++];
		}
		while (j < n2) {
			array3[k++] = array2[j++];
		}
		return array3;
	}

}
