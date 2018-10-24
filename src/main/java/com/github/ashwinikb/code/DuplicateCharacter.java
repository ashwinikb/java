package com.example.ashwinikb;

import java.util.HashSet;

public class DuplicateCharacter {

	public static char duplicate(char[] ch) {

		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < ch.length - 1; i++) {
			char c = ch[i];
			if (set.contains(c)) {
				return c;
			} else {
				set.add(c);
			}
		}

		return 0;

	}
}
