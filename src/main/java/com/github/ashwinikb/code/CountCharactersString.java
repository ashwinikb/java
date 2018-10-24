package com.example.ashwinikb;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class CountCharactersString {
	
	public static void findDuplicateCharacters(String s) {
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0; i < s.length();i++) {
			char ch = s.charAt(i);
		if(map.containsKey(ch)) {
			map.put(ch, map.get(ch)+1);
		}else {
			map.put(ch, 1);
		}
		}
		 Set<Character> keys = map.keySet();
	        for(Character ch:keys){
	            if(map.get(ch) > 1){
	                System.out.println(ch+" "+map.get(ch));
	            }
	        }
		
	}
	
public static void findDuplicateWords(String s, String search) {
		String[] str = s.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < str.length;i++) {
			String word = str[i];
		if(map.containsKey(word)) {
			map.put(word, map.get(word)+1);
		}else {
			map.put(word, 1);
		}
		}
		 Set<String> keys = map.keySet();
	        for(String st:keys){	           
	                System.out.println(st+" "+map.get(st));	           
	        }
		
	}

}
