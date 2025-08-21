package collections;

import java.util.HashSet;
import java.util.Set;

public class SetSDifference {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(3);
		set1.add(5);
		set1.add(7);
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(5);
		set2.add(8);
		set2.add(9);
		set1.removeAll(set2);
		System.out.println("Difference"+ set1);
		
	}

}
