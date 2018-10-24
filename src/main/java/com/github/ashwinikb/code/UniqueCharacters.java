package com.example.ashwinikb;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	public static void unique(String s) {
		char[] ch = s.toCharArray();
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < ch.length; i++) {
			if (set.contains(ch[i])) {
				continue;
			} else {
				set.add(ch[i]);			
				count++;
			}

		}

	}
	public static void main(String[] args) {
		UniqueCharacters.unique("hello");
		System.out.println(count);
		
	}

}
