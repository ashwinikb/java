package com.github.ashwinikb.code;

/*
Please implement this method to
return the sum of all integers found in the parameter String. You can assume that
integers are separated from other parts with one or more spaces (' ' symbol).
For example, s="12 some text 3  7", result: 22 (12+3+7=22)
*/

public class SumOfIntegers {

	static String regex = "\\d+";

	public static int getSumOfNumbers(String input) {
		int result = 0;
		
		String[] inputArray = input.split(" ");

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i].matches(regex)) {
				result = result + Integer.parseInt(inputArray[i]);
			}
		}

		return result;
	}

}
