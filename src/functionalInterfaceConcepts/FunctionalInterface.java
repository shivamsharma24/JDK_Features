package functionalInterfaceConcepts;

import java.util.function.Function;

public class FunctionalInterface {

	public static void main(String[] args) {

		/*
		 * Interface Function<T,R> Type Parameters: T - the type of the input to the
		 * function R - the type of the result of the function
		 * 
		 */
		
		//Ex-1 of Function
		Function<String, Integer> func= x->x.length();
		
		Integer len = func.apply("This is java 8");
		System.out.println(len);
		
		//Ex-2 Chaining function
		Function<Integer, Integer> func1= x->x*2;
		Integer result = func.andThen(func1).apply("Shivam Sharma");
		System.out.println(result);
	}

}
