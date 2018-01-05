package com.github.ashwinikb.sort;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class BubbleSort {

	public static List<Integer> sort(List<Integer> data) {

		for (int i = 0; i < data.size(); i++) {
			for (int j = 0; j < data.size() - 1; j++) {
				if (data.get(j) > data.get(j + 1))
					Collections.swap(data, j, j + 1);
			}
		}
		return data;
	}

	void bubbleSortJava8Approach(Integer[] arr) {
		int n = arr.length;
		IntStream.range(0, n - 1).flatMap(i -> IntStream.range(i + 1, n - i)).forEach(j -> {
			if (arr[j - 1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		});
	}

}
