package com.example.ashwinikb;

import java.util.Random;

public class RandomElement {
	public static int getRandom(int[] array) {
	    int random = new Random().nextInt(array.length);
	    return array[random];
	}

	

}
