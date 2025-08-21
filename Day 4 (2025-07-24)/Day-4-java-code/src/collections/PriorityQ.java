package collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
	public static void main(String[] args) {
		Queue<Integer> line = new PriorityQueue<>(Collections.reverseOrder());
		line.add(11);
		line.add(12);
		line.add(41);
		line.add(25);
		line.add(65);
		line.add(58);
		System.out.println(line);
		line.add(67);
		System.out.println(line);
		}

}
