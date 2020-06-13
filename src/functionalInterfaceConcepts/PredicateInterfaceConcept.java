package functionalInterfaceConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

// This is a functional interface and can therefore be used as the assignment target for 
	// a lambda expression or method reference.

	// Predicate always return boolean value
	public static void main(String[] args) {
		Predicate<Integer> func = x -> x > 5;

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 55, 6, 6, 67, 77, 9);
		List<Integer> col_list = list.stream().filter(func).collect(Collectors.toList());
		System.out.println("" + col_list);

		// Predicate with && operator
		List<Integer> list2 = list.stream().filter(x -> x > 5 && x < 9).collect(Collectors.toList());
		System.out.println(list2);

		// Predicate with Negate
		List<String> namelist = Arrays.asList("Java", "Ja", "Java", "Jav","Shivam");
		Predicate<String> nameExp = x -> x.startsWith("Ja");
		List<String> output = namelist.stream().filter(nameExp.negate()).collect(Collectors.toList());
		System.out.println("" + output);
	}
}
