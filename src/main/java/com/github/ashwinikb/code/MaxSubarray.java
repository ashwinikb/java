package com.example.ashwinikb;

public class MaxSubarray {

	public static int array(int[] arr) {
		int sum = 0;
		int maxSum = 0;
		for(int i = 0; i<arr.length; i++) {
			if(sum+arr[i]<=arr[i]) {
				sum = arr[i];
			}else {
				sum+= arr[i];
			}
			if(sum >= maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
		
	}
}
