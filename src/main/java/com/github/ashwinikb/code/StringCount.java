package com.github.ashwinikb.code;

/*
Please implement this method to
return the word count in a given String.
Assume that the parameter String can only contain spaces and alphanumeric characters.
*/
public class StringCount {
	static String regex = "(?<=\\s|^)[a-zA-Z]*(?=[.,;:]?\\s|$)";

	public static int countWords(String s) {
		int count = 0;

		String[] inputArray = s.split(" ");

		for (int i = 0; i <= inputArray.length-1; i++) {
			if (inputArray[i].matches(regex)) {
				count++;
			}
		}

		return count;

	}
}
