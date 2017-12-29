package com.github.ashwinikb.sort;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

/**
 * @author Ashwini KB
 */

public class BubbleSortTest {

	@Test
	public void test() {

		List<Integer> result = BubbleSort.sort(Arrays.asList(10, 1, 5, 9, 4));
		List<Integer> expetced = Arrays.asList(1, 4, 5, 9, 10);

		// Expected Equals
		assertThat(result, is(expetced));

		// Expected Not-Equals
		assertThat(result, is(not(Arrays.asList(10, 1, 5, 9, 4))));

		System.out.println("Result :" + result);

	}

}
