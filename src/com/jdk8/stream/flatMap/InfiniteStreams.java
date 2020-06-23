package com.jdk8.stream.flatMap;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		
		//Infinite stream are used to generate infinite stream of data
		
		//1. Using iterate() method
			List<Integer> collect = IntStream.iterate(0, n->n+1)
			.mapToObj(Integer::valueOf)
			.limit(10)
			.collect(Collectors.toList());
			
			System.out.println(collect);
			
		//2. using generate() method
			
			List<Integer> collect2 = Stream.generate(()-> (new Random().nextInt(10)))
				.limit(10)
				.collect(Collectors.toList());
			System.out.println(collect2);
			
	
	}
}
