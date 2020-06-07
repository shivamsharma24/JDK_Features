package LambdaConcepts;

public class LambdaDeclaration {

	public static void main(String[] args) {

		// 1- Create anonymous Inner type Lambda concept
		WebPage wp = new WebPage() {

			@Override
			public void header(String value) {
				System.out.println("Hi " + value);
			}
		};

		// 2- Above anonymous Inner type converted to Lambda expression
		WebPage wp1 = value -> System.out.println("Hello " + value);
		
		WebPage wp2 = value -> System.out.println(value.toUpperCase());


		wp.header("shivam");
		wp1.header("Sharma");
		wp2.header("java");
	}

}
