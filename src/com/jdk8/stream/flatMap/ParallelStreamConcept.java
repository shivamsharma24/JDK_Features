package com.jdk8.stream.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {
		// Checking no. of cores in laptop
		ForkJoinPool corepools = ForkJoinPool.commonPool();
		System.out.println(corepools.getParallelism());

		// 2- parallel() method on stream
		Stream stream = Stream.of("Shivam", "james", "Shane", "Sourav");

		// Example of sequential stream
		Stream.of("Shivam", "james", "Shane", "Sourav").forEach(System.out::println);
		System.out.println("====================================");
		// Example of Parallel stream
		Stream.of("Shivam", "james", "Shane", "Sourav").parallel().forEach(System.out::println);
		System.out.println("====================================");

		// 3 Use parallelStream() method on a collection stream
		Arrays.asList("Shivam", "james", "Shane", "Sourav").parallelStream().forEach(System.out::println);

		// 4. printing 1 to 10 using seq and Parallel stream
		System.out.println("===Using seq.. Stream");
		IntStream.range(1, 10).forEach(System.out::println);

		System.out.println("===Using parallel Stream");
		IntStream.range(1, 10).parallel().forEach(System.out::println);

		// 5. print a-z --> 97- 122
		System.out.println("=====Seq stream========");
		getAlpabhets().stream().forEach(System.out::println);
		
		System.out.println("=====parallel stream======");
		getAlpabhets().parallelStream().forEach(System.out::println);
		
		//Check stream is running in parallel mode
		System.out.println("=====stream is not in parallel mode======");
		IntStream range = IntStream.range(1, 10);
		System.out.println(range.isParallel());//False
		
		System.out.println("=====stream is in parallel mode======");
		IntStream range1 = IntStream.range(1, 10).parallel();
		System.out.println(range1.isParallel());//true
		
	}

	public static List<String> getAlpabhets() {

		List<String> alpha = new ArrayList<String>();

		int n = 97;
		while (n <= 122) {
			char ch = (char) n;
			alpha.add(String.valueOf(ch));
			n++;
		}
		return alpha;
	}
}
