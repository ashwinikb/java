package com.example.ashwinikb;

public class RemoveValue {
	
	public static int removeVal(int[] array, int value) {
		if(array == null ) return 0;
		int i=0;
		for(int j = 0; j< array.length; j++) {
			if(array[j] != value) {
				array[i] = array[j];
				i++;
				
			}
		}
		
		return i;
		
	}

}
