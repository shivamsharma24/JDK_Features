package functionalInterfaceConcepts;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {

		/*
		 * Represents an operation upon two operands of the same type, producing a
		 * result of the same type as the operands. This is a specialization of
		 * BiFunction for the case where the operands and the result are all of the same
		 * type.
		 */

		// BinaryOperator is an Interface which extends BiFunction Interface
		BinaryOperator<Integer> f1 = (x1, x2) -> x1 + x2;
		Integer result = f1.apply(10, 10);
		System.out.println(result);

		//BiFunction Interface
		BiFunction<Integer, Integer, Integer> f2 = (x1, x2) -> x1 + x2;
		Integer res = f2.apply(10, 20);
		System.out.println(res);
	}

}
