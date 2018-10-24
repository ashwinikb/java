package com.example.ashwinikb;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void duplicate(int[] array, int size) {
		int j;
		System.out.println("Elements are: ");
		for (int i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					System.out.print(array[j] + " ");

			}
		}
	}

	public static int removeDuplicates(int arr[], int n) {
		if (n == 0 || n == 1)
			return n;

		int j = 0;
		for (int i = 0; i < n - 1; i++)
			if (arr[i] != arr[i + 1])
				arr[j++] = arr[i];
		arr[j++] = arr[n - 1];

		return j;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
		int n = arr.length;

		n = removeDuplicates(arr, n);

		// Print updated array
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

		Duplicate.duplicateInt(arr);
	}

	public static void duplicateInt(int[] num) {

		Set<Integer> uniques = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for (int i = 0; i < num.length; i++) {

			if (!uniques.contains(num[i])) {
				uniques.add(num[i]);
			}
			else
			{
				duplicates.add(num[i]);
			}
		}
//		System.out.println("Uniques :" + uniques);
		System.out.println("Duplicates :" + duplicates);

	}

}
