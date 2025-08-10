package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class StreamDemo4 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		double average = numbers.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
		System.out.println("Average: " + average);

	}

}
