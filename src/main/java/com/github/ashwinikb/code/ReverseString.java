/**
 * 
 */
package com.github.ashwinikb.code;

/**
 * @author ashwini
 *
 */
public class ReverseString {
	public static void main(String[] args) {
		ReverseString.reverse("Hello");
	}
	public static String reverse(String s) {
		String[] str = s.split("");
		for(int i =str.length-1; i>=0;i--) {
			System.out.print(str[i]);
		}
		return s;
		
	}

}
