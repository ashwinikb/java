package com.example.ashwinikb;

public class MissingNumber {
	
	public static int number(int[] array) {
		
		for(int i = 0; i < array.length;i++) {
			if(array[i]!= i+1) {
				return i+1;
			}
		}
		return 0;
		
	}

}
