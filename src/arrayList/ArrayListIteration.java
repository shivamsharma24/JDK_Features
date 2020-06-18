package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> series = new ArrayList<String>();
		series.add("games of thrones");
		series.add("Money heist");
		series.add("Prison break");
		series.add("Breaking bad");
		series.add("How I met your mother");

		// 1- Using Java 8 with for-each loop and lambda expression

		System.out.println("++++++++++++++++Using for-each with lambda Exp++++=====================");
		series.forEach(show -> {
			System.out.println(show);
		});
		System.out.println("++++++++++++++++Using Iterator++++=====================");
		// 2- Using iterator
		Iterator<String> itr = series.iterator();
		while (itr.hasNext()) {
			String shows = itr.next();
			System.out.println(shows);

		}

		// 3- Using Iterator and ForEachRemaining method() in Java8
		System.out.println("++++++++++++++++Using Iterator and ForEachRemaining method()++++=====================");

		itr = series.iterator();
		itr.forEachRemaining(show -> {
			System.out.println(show);
		});

		// 4- using For-each loop
		System.out.println("++++++++++++++++Using forEach loop++++=====================");

		// 5- using for loop with order/index
		System.out.println("++++++++++++++++using for loop with order/index++++=====================");
		for (int i = 0; i < series.size(); i++) {

			System.out.println(series.get(i));
		}

		// 6- Using list Iterator to traverse in both directions
		System.out
				.println("++++++++++++++++Using list Iterator to traverse in both directions++++=====================");

		ListIterator<String> listItear = series.listIterator(series.size());

		while (listItear.hasPrevious()) {
			String shows = listItear.previous();
			// prints in backward direction
			System.out.println(shows);

		}
	}

}
