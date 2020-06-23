package com.jdk8.stream.flatMap;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

	public static void main(String[] args) {

		long t1,t2;
		
		// For sequential don't use parallel
		t1 = System.currentTimeMillis();
		long count = Stream.iterate(0,n->n+1)
		.limit(500000)
	//	.parallel()
		.filter(PrimeNumberWithParallelStream::prime)
		.peek(x-> System.out.println(x))
		.count();
		
		System.out.println("Total prime no "+ count);
		t2 = System.currentTimeMillis();

		System.out.println("total time taken " + (t2 - t1) / 1000);
		//For sequential performance
		// Total prime no 41539
		// total time taken 52
		
		///For parallel Stream performance
		//Total prime no 41539
		//total time taken 24
	}

	public static boolean prime(int number) {
		if (number <= 1)
			return false;

		return !IntStream.range(2, number / 2).anyMatch(x -> number % x == 0);
	}

}
