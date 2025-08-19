package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("jayanta", "jnanedra", "ajay");
		List<String> filterednames = names.stream()
				.filter(name -> name.contains("ja"))
	            .collect(Collectors.toList());
		System.out.println(filterednames);
				

	}

}
