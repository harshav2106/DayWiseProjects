package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("harsha","amit","amit","Vasu");
		list.stream().distinct().collect(Collectors.toList());
		Predicate<String> pred=s->s.length()<5;
		Function<String,String> f=s->s.toUpperCase();
		List<String> outputList = list.stream()
				.filter(s->s.length()<5)
				.map(s->s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(outputList);
	}

}
