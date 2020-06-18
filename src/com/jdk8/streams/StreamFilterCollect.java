package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	public static void main(String[] args) {

		List<String> prodList = Arrays.asList("Macbook", "iphone", "shoes", "Battery Charger", "bat");
		prodList.forEach(ele -> System.out.println(ele));

		// Using lambda Exp
		List<String> result = prodList.stream().filter(ele -> !ele.equals("shoes")).collect(Collectors.toList());
		result.forEach(ele -> System.out.println(ele));

		// Using method reference
		result.forEach(System.out::println);
	}
}
