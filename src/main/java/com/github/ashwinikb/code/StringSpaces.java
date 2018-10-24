package com.example.ashwinikb;

public class StringSpaces {
	
	public static String spaceRemoval(String s) {
		String str = s.replaceAll("\\s", "");
		return str;	
	}
	public static StringBuffer spaceRemovalAnother(String s) {
		char[] strArray = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		 
        for (int i = 0; i < strArray.length; i++) {
            if( (strArray[i] != ' ') && (strArray[i] != '\t') ) {
               sb.append(strArray[i]);
            }
        }
 
		return sb;
	
	}
}
