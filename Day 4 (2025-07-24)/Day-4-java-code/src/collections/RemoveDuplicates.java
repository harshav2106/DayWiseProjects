package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 1, 6);
        System.out.println("Original List: " + numbers);

        Set<Integer> set = new LinkedHashSet<>(numbers);
        List<Integer> uniqueNumbers = new ArrayList<>(set);

        System.out.println("List after removing duplicates: " + uniqueNumbers);

	}

}
