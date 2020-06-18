package com.jdk8.stream.flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamStringArrayWithFlatMap {

	public static void main(String[] args) {

		String data[][] = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };
		Stream<String[]> dataStream = Arrays.stream(data);

		// Apply FlatMap on dataStream
		Stream<String> dataStreamFlatMap = dataStream.flatMap(x -> Arrays.stream(x));
		Stream<String> dataStreamFilter = dataStreamFlatMap.filter(x -> "a".equals(x.toString()));
		dataStreamFilter.forEach(System.out::println);
		
		//When above code written in single line
		Stream<String> finalStream = Arrays.stream(data).
				flatMap(x -> Arrays.stream(x)).
				filter(x-> "b".equals(x.toString()));
		
		finalStream.forEach(System.out::println);
	}
}
