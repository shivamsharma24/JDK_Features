package functionalInterfaceConcepts;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {

	public static void main(String[] args) {

		// Takes no argument and return a result

		// ()= Zero argument
		getText(() -> "Java");
	}

	public static void getText(Supplier<String> text) {
		System.out.println(text.get());

	}
}
