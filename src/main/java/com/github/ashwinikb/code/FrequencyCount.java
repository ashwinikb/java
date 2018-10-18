package com.example.ashwinikb;

public class FrequencyCount {

	public static int wordCount(String s, String word) {

		int count = 0;
		String[] str = s.split(" ");

		for (int i = 0; i < str.length - 1; i++) {
			if (str[i].equals(word)) {
				count++;
			}
		}
		return count;

	}

}
