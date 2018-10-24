package com.example.ashwinikb;

import java.util.HashSet;
import java.util.Set;

public class LargestSubString {

	public static int subStringLargest(String s) {

		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (allUniques(s, i, j))
					ans = Math.max(ans, j - i);

			}
		}
		return ans;

	}

	private static boolean allUniques(String s, int start, int end) {

		Set<Character> set = new HashSet<>();
		for (int i = start; i < end; i++) {
			Character ch = s.charAt(i);

			if (set.contains(ch)) {
				return false;
			} else {
				set.add(ch);
			}
		}

		return true;
	}

}
