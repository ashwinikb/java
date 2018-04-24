/**
 * 
 */
package com.github.ashwinikb.code;

/**
 * @author ashwini
 *
 */
public class RevereseArraySpec {
	public static void main(String[] args) {
		String s = "a**bc";
		char[] charArray = s.toCharArray();
		RevereseArraySpec.special(charArray);
		String revStr = new String(charArray);
		System.out.println(revStr);
	}

	public static void special(char[] s) {

		char temp = 0;
		int r = s.length-1;
		int l = 0;

		while (l < r) {
			if ((String.valueOf(s[l])).matches("[^A-Za-z0-9 ]")){
				l++;
			} else if (String.valueOf(s[r]).matches("[^A-Za-z0-9 ]")) {
				r--;
			} else {
				temp = s[l];
				s[l] = s[r];
				s[r] = temp;
				l++;
				r--;
			}

		}
	}
}
