package com.wipro.annonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest1 {

//	public static void main(String[] args) {
//		List<String> input = List.of("Harsha","vardhan","chandra");
//		Function<List<String>,List<Integer>> getLengths = list->{
//			List<Integer> lengths = new ArrayList<>();
//			for(String s : list) {
//				lengths.add(s.length());
//			}
//			return lengths;
//		};
//		List<Integer>result = getLengths.apply(input);
//		System.out.println(result);
//
//	}
//
//}
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Jayanta", "Amit", "Vasu");
        Function<String, Integer> slf = s -> s.length();
        List<Integer> lengths = new ArrayList<>();
        for (String name : names) {
            int length = slf.apply(name);
            lengths.add(length);
        }
        System.out.println(lengths);
	}

}
