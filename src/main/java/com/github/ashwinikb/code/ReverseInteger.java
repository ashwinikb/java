package com.example.ashwinikb;

public class ReverseInteger {
	
	public static int reverse(int x) {

		int result = 0;
		while(x !=0) {
			int mod = x%10;
			x/=10;
			result = result*10+mod;
		}
		return result ;
		
	}
	
}
