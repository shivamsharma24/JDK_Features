package functionalInterfaceConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {

		// Represents an operation that accepts
		// a single input argument and returns no result

		Consumer<String> cons = x -> System.out.println(x);
		cons.accept("Hi ");

		// Example on list
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 55, 6, 6, 67, 77, 9);
		list.forEach(x -> System.out.println(x));
	}
}
