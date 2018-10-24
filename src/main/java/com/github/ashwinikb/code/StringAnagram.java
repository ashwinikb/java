package com.example.ashwinikb;

import java.util.Arrays;

public class StringAnagram {
	public static boolean anagram(String word, String anagram){
        char[] charWord = word.toCharArray();
        char[] charAnagram = anagram.toCharArray();       
        Arrays.sort(charWord);
        Arrays.sort(charAnagram);
       
        return Arrays.equals(charWord, charAnagram);
    }

}
