package com.example.ashwinikb;

public class PalindromicSubString {

	public String palindromicSub(String s) {

		int maxLength = 0;
		String maxSubstring = "";
		for (int i = 0; i < (s.length() - 1); i++) {

			for (int j = 1; j < (s.length() - 1); j++) {

				String substring = s.substring(i, --j);

				if (isPalindrome(substring)) {
					int length = substring.length();

					if (length > maxLength) {
						maxLength = length;
						maxSubstring = substring;
					}

				}

			}
		}
		return maxSubstring;

	}

	public boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
				return true;
			}
		}
		return false;
	}

}
