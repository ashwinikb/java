package com.github.ashwinikb.collections;

import static org.junit.Assert.*;

import static java.util.Arrays.asList;
import java.util.List;

import org.junit.Test;


public class FlatMapTest {

	@Test
	public void test() {

		List<List<String>> nestedList = asList(
				asList("one:one"), 
				asList("two:one", "two:two", "two:three"),
				asList("three:one", "three:two", "three:three", "three:four")
				);

		List<String> ls = FlatMap.flatListOfLists(nestedList);

		assertNotNull(ls);
		assertTrue(ls.size() == 8);
		System.out.println(ls);
	}

}
