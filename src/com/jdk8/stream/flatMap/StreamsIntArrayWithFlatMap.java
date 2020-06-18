package com.jdk8.stream.flatMap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsIntArrayWithFlatMap {

	public static void main(String[] args) {
		int data[] = { 1, 2, 3, 4, 5, 6, 7 };

		Stream<int[]> streamArray = Stream.of(data);
		IntStream streamInInt = streamArray.flatMapToInt(x -> Arrays.stream(x));
		streamInInt.forEach(x -> System.out.println(x));
		
		//FlatMap is used when there is a 3 level mapping
		// Stream<List<String>>
		//Stream<List<Object>>
		
		//Normal use case is
		// Stream<String>-- here we don't need to use FlatMapConcept
	}
}
