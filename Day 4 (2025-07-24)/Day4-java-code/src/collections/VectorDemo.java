package collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<String> books = new Vector<>();
		books.add("physics");
		books.add("maths");
		books.add("geography");
		books.add("psycology");
		System.out.println(books.get(2));

	}

}
