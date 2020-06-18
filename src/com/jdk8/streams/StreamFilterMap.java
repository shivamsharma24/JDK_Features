package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMap {
	public static void main(String[] args) {
		List<Customer> customer = Arrays.asList(new Customer("Shivam", 29), new Customer("James", 30),
				new Customer("katiyar", 31), new Customer("Ketan", 32));

		String name = customer.stream().filter(x -> "Shivam".equals(x.getName())).map(Customer::getName).findAny()
				.orElse(null);

		// System.out.println(name);

		// print all the names from the list
		List<String> custlist = customer.stream().map(Customer::getName).collect(Collectors.toList());
		custlist.forEach(System.out::println);
	}

}
