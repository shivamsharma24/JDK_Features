package lambdaConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodReference {

	public static void main(String[] args) {
		// 1- using Anonymous class
		System.out.println("===Using anonymous inner class==");
		List<String> list = Arrays.asList("Shivam", "Rohit", "Charu", "Harsh");
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

		// 2- Using Lamda Exp
		System.out.println("=== Using Lamda Exp===========");
		list.forEach(str -> System.out.println(str));

		// 2- Using method Reference
		System.out.println("=== Using method Reference===========");
		list.forEach(System.out::println);
	}

}
