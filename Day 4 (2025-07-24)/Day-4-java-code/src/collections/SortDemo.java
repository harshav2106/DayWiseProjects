package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,45,9,0,5,6);
		Collections.sort(list);
		System.out.println(list);

	}

}
