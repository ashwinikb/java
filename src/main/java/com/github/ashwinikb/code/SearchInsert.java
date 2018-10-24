package com.example.ashwinikb;

public class SearchInsert {
	
	public static int search(int[] nums, int target) {
		for(int i = 0; i < nums.length;i++) {
			if(target<=nums[i]) {
				return i;
			}
		}
		return nums.length;
		
	}

}
