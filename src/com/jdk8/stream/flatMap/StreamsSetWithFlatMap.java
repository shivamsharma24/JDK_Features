package com.jdk8.stream.flatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSetWithFlatMap {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.addDevices("Samsung");
		emp.addDevices("Micromax");
		emp.addDevices("Dell");
		emp.addDevices("portronics");

		Employee emp1 = new Employee();
		emp1.addDevices("Samsung");
		emp1.addDevices("Micromax");
		emp1.addDevices("Asus");
		emp1.addDevices("Toshiba");

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		
		List<String> deviceList = list.stream()
		.map(x-> x.getDevices())
		.flatMap(x-> x.stream())
		.distinct()
		.collect(Collectors.toList());
		
		deviceList.forEach(x->System.out.println(x));
		
	}

}
