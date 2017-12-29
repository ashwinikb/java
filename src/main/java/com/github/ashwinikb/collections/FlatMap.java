package com.github.ashwinikb.collections;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ashwini KB
 */

public class FlatMap {

	public static <T> List<T> flatListOfLists(List<List<T>> list) {

		return list.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());

	}
}
