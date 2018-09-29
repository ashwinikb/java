package com.github.ashwinikb.collections;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	/**
	 * Create a flat list from a list of lists
	 * 
	 * @param list
	 * @return
	 */
	public static <T> List<T> flatListOfLists(List<List<T>> list) {

		return list.stream().flatMap(Collection::stream).collect(Collectors.toList());

	}
}
