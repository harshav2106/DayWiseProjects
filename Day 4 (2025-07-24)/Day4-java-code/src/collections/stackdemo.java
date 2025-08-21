package collections;

import java.util.Stack;

public class stackdemo {

	public static void main(String[] args) {
		Stack<String> books = new Stack<>();
		books.push("physics");
		books.push("maths");
		books.push("geography");
		books.push("psycology");
		books.pop();

		System.out.println(books.peek());
	}

}
