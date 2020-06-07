package LambdaConcepts;

//Functional Interface is a special type of interface can have only one abstract method
@FunctionalInterface
public interface WebPage {

	// writing one abstract method
	// Abstract method don't have implem^ only method prototype
	
	
	public void header(String value);// Can have one abstract method in Functional interface
	
	public static void test() { //can have static method in Functional interface
		
	}
	
	default void display() {//can have default method in Functional interface
		
	}
}
