package com.example.ashwinikb;

public class LargestSmallest {

	public static void numbers(int[] array) {
		int largestNum = array[0];
		int smallestNum = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] > largestNum) {
				largestNum = array[i];
			} else if (array[i] < smallestNum) {
				smallestNum = array[i];
			}

		}
		System.out.println("The largest num is: " + largestNum);
		System.out.println("The smallest num is: " + smallestNum);
	}

}
