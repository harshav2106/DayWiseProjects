package com.wipro.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,4,7,1,6,8,44,44);
		list
		.stream()
		.distinct()
		.filter(i->i%2==0)
//		.count();
		.reduce(0,(a,b)->a+b);
		System.out.println(list);

	}

}
