package com.github.ashwinikb.code;

/* Definition: A palindrome is a string that reads the same forward and backward.
	For example, "abcba" is a palindrome, "abab" is not.
	Please implement this method to
	return true if the parameter is a palindrome and false otherwise.
*/
public class Palindrome {

	public static boolean isPalindrome(String input) {

		for (int i = 0; i < input.length() / 2; i++) {

			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
