package com.github.ashwinikb.code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClosestToZeroTest {

	@Test
	public void test() {
		int a[] = { 10, 2, -2, -1, 5 };
		int result = ClosestToZero.getClosestToZero(a);
		assertEquals(result, -1);
		System.out.println(result);

	}

	@Test
	public void test2() {
		int a[] = { 5, 20, 10, 2 };
		int result = ClosestToZero.getClosestToZero(a);
		assertEquals(result, 2);
		System.out.println(result);

	}

	@Test
	public void test3() {
		int a[] = { 5, 3, 0, -1, -2 };
		int result = ClosestToZero.getClosestToZero(a);
		assertEquals(result, -1);
		System.out.println(result);

	}

	@Test
	public void test4() {
		int a[] = { 5, 3, 0 };
		int result = ClosestToZero.getClosestToZero(a);
		assertEquals(result, 3);
		System.out.println(result);

	}

}
