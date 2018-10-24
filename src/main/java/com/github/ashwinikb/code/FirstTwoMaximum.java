package com.example.ashwinikb;

public class FirstTwoMaximum {
	public static void maximum(int[] number) {
		int max1 = 0;
		int max2 = 0;
		for (int i = 0; i < number.length; i++) {
			if (max1 < number[i]) {
				max2 = max1;
				max1 = number[i];
			} else if (max2 < number[i]) {
				max2 = number[i];
		}						
			 System.out.println("First Max Number: "+max1);
		     System.out.println("Second Max Number: "+max2);	
		}
		
	}
	public static void main(String[] args) {
		int[] number = {38,45,26,58};
		FirstTwoMaximum.maximum(number);
		
	}

}
