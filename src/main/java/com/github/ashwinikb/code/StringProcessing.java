package com.github.ashwinikb.code;

public class StringProcessing {

	static String regex = "(?<=\\s|^)[a-zA-Z]*(?=[.,;:]?\\s|$)";

	public static String getSumOfString(String input) {
		String result = "";

		String[] inputArray = input.split(" ");

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].matches(regex)) {
				result = result + " " + inputArray[i];
			}
		}

		return result;
	}

}
