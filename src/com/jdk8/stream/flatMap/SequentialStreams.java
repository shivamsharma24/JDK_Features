package com.jdk8.stream.flatMap;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreams {
	public static void main(String[] args) {
		//Using Stream.of
		Stream<String> seqStream = Stream.of("Shivam", "Deepak", "Diyaan", "ketan");
		seqStream.forEach(System.out::println);
		
		//2- Using Arrays
		Arrays.asList("a1","a2","a3")
		.stream()
		.findFirst()
		.ifPresent(System.out::println);
		
		//3. range from 1 to 5
		IntStream.range(1, 5)
		.forEach(System.out::println);
		
		//4.
		Arrays.stream(new int[] {1,2,3,4,5})
		.map(n-> n*2+1)
		.average()
		.ifPresent(System.out::println);
		
		//5. String data Objects
		Stream.of("a1", "a2", "a3", "a4")
		.map(s-> s.substring(1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);
		
		//6. double to String objects
		Stream.of(1.0, 2.0, 3.8,4.7)
		.mapToInt(Double::intValue)
		.mapToObj(s->"a"+s)
		.forEach(System.out::println);
		
		
		//7. limit
		Stream.iterate(0, n->n+1)
		.limit(10)
		.forEach(System.out::println);
		
		// 8- odd numbers
		Stream.iterate(1, n->n+1)
		.filter(x->x%2!=0)
		.limit(10)
		.forEach(System.out::println);
		
		//9.Even 
		Stream.iterate(1, n->n+1)
		.filter(x->x%2==0)
		.limit(10)
		.forEach(System.out::println);
	}
}
