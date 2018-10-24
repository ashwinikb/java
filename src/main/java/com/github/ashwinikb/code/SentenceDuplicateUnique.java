package com.example.ashwinikb;

import java.util.HashSet;
import java.util.Set;

public class SentenceDuplicateUnique {
	public static void duplicate(String sentance) {

		Set<String> uniques = new HashSet<>();
		Set<String> duplicates = new HashSet<>();

		String[] strArray = sentance.split(" ");

		for (String s : strArray) {
			if (!uniques.contains(s)) {
				uniques.add(s);
			} else {
				duplicates.add(s);
			}
		}

		uniques.removeAll(duplicates);

		System.out.println("Uniques :" + uniques);
		System.out.println("Duplicates :" + duplicates);

	}

	public static void main(String[] args) {
		String s = "i code i eat i sleep";
		// Uniques : [code eat sleep]
		// Duplicates : [i]
		DuplicateStringSentence.duplicate(s);
	}

}
