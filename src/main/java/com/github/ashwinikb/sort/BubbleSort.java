package com.github.ashwinikb.sort;

import java.util.Collections;
import java.util.List;

/**
 * @author Ashwini KB
 */
public class BubbleSort {
	
	public static List<Integer> sort(List<Integer> data){

	for(int i = 0; i < data.size(); i++) {
		for(int j = 0; j < data.size()-1; j++) {
			if(data.get(j)>data.get(j+1))
			Collections.swap(data, j, j+1);
		}
	}
	return data;
	
	
}
}
