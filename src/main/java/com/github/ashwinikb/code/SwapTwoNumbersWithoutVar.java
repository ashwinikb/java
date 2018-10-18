package com.example.ashwinikb;

public class SwapTwoNumbersWithoutVar {
	
	public static void swapping(int x, int y) {
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("Value of x:" + x);
		System.out.println("Value of y:" + y);

	}
	
	public static void main(String[] args) {
		SwapTwoNumbersWithoutVar.swapping(5, 10);
		
	}

}
