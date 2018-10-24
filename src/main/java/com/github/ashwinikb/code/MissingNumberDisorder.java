package com.example.ashwinikb;

import java.util.Arrays;

public class MissingNumberDisorder {
	public static int getMissingNo (int[] a, int n) 
    { 
		int i, total; 
	    total  = (n+1)*(n+2)/2;    
	    for ( i = 0; i< n; i++) 
	       total = total - a[i]; 
	    return total; 
    }

	public static int missingNum(int[] array) {
		
		Arrays.sort(array);
		for(int i = 0; i<array.length; i++) {
			if(array[i] != i+1) {
				return i+1;
			}
		}
		
		return 0;
		
	}
}
