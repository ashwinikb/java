package com.example.ashwinikb;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateStringSentence {

	public static void duplicate(String s) {

		Set<String> uniques = new HashSet<>();
		Set<String> duplicates = new HashSet<>();

		String[] strArray = s.split(" ");

		for (int i = 0; i < strArray.length; i++) {

			for (int j = i + 1; j < strArray.length; j++) {

				if (strArray[i].equalsIgnoreCase(strArray[j])) {
					duplicates.add(strArray[j]);
				} else {
					uniques.add(strArray[j]);
				}
			}

		}
		
		uniques.removeAll(duplicates);

		System.out.println("Uniques :" + uniques);
		System.out.println("Duplicates :" + duplicates);

	}
	
	public static void duplicateSec(String s) {

		Set<Character> uniques = new HashSet<>();
//		Set<Character> duplicates = new HashSet<>();

		char[]ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if(!uniques.contains(ch[i])){
				uniques.add(ch[i]);
				
			}
//				else {
//				duplicates.add(ch[i]);
//			}
		}
		
		
		
		System.out.println("Uniques :" + uniques + "Size of the Unique character is : " + uniques.size());
//		System.out.println("Duplicates :" + duplicates);

	}



	public static void main(String[] args) {
		String s = "HelloWorld";
		// Uniques : [code eat sleep]
		// Duplicates : [i]
		DuplicateStringSentence.duplicateSec(s);
	}

}
