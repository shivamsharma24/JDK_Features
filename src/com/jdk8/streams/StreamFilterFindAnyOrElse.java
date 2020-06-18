package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {

		List<Customer> customer = Arrays.asList(new Customer("Shivam", 29), new Customer("James", 30),
				new Customer("katiyar", 31), new Customer("Ketan", 32));

		// filter with findany and return
		Customer customerr = customer.stream() // convert list to Stream
				.filter(x -> "Ketan".equals(x.getName())) // filter it for ketan
				.findAny()// return the list
				.orElse(null);

		System.out.println(customerr.getName() + " " + customerr.getAge());

		// filter didnot findany or else
		Customer customerr1 = customer.stream() // convert list to Stream
				.filter(x -> "Varma".equals(x.getName())) // filter it for ketan
				.findAny()// return the list
				.orElse(null);

		System.out.println(customerr1);
		// 3- filter with multiple conditions
		customerr1 = customer.stream().filter(x -> "Shivam".equals(x.getName()) && 29 == x.getAge()).findAny()
				.orElse(null);
		System.out.println(customerr1.getName() + " " + customerr1.getAge());
	}

}
