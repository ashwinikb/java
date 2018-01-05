package com.github.ashwinikb.code;

import java.util.Arrays;
import java.util.Collections;

/**
 * Implement this method to return the number in the array that is closest to
 * zero. If there are two equally close to zero elements like 2 and -2 -
 * consider the positive element to be "closer" to zero.
 * 
 * 
 */

public class ClosestToZero {
	public static int getClosestToZero(int[] a) {

		Arrays.sort(a);

		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				if (i == 0) {
					return a[i];
				}

				int diff1 = a[i] - 0;

				int diff2;

				if (a[i - 1] != 0) {
					diff2 = Math.abs(a[i - 1]) - 0;
				} else {

					if (i >= 2) {
						return a[i - 2];
					} else {
						return a[i];
					}

				}

				if (diff1 > diff2) {
					return a[i - 1];
				} else {
					return a[i];
				}

			}
		}

		return 0;

	}
}
