package functionalInterfaceConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorConcept {

	public static void main(String[] args) {

		/*
		 * Represents an operation on a single operand that produces a result of the
		 * same type as its operand. This is a specialization of Function for the case
		 * where the operand and result are of the same type.
		 */

		// Unary operator Interface extends Function Interfaces
		UnaryOperator<Integer> f1 = x -> x * 3;
		Integer res = f1.apply(5);
		System.out.println(res);

		// Doing with Function interface
		Function<Integer, Integer> f2 = x -> x * 5;
		System.out.println(f2.apply(5));

		// Apply unary opeartor Interface in arraylist
		List<String> l = new ArrayList<String>();
		l.add("Java");
		l.add("Selenium");
		
		l.replaceAll(ele->ele+" Automation");
		System.out.println(l);

	}
}
