package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queuedemo {

	public static void main(String[] args) {
		Deque<String> persons = new LinkedList<>();
		persons.offer("harsha");
		persons.offer("chandra");
		persons.offer("badarinath");
		persons.offer("srikanth");
		persons.offerFirst("harsha");
		System.out.println(persons);
		persons.removeLast();
		System.out.println(persons);

	}

}
