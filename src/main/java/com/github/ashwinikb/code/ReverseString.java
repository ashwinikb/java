package com.example.ashwinikb;

public class ReverseString {

	public static String reverse(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;

	}

	public static String reverseSen(String s) {
		String[] str = s.split(" ");	
		String st = null;
		for (int i = str.length - 1; i >= 0; i--) {
			if (st != null) {
				st = st + " " + str[i];
			} else {
				st = str[i];
			}
		}
		return st;

	}

}
