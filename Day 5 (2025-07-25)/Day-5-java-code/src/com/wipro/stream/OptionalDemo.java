package com.wipro.stream;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Optional<Integer> Int = Optional.ofNullable(null);
				if(Int.isPresent())
				{
					System.out.println(Int.get());
				}
				else
				{
					System.out.println(0);
				}
//		String str = null;
//		if(str!=null)
//		{
//			str.toUpperCase();
//		}

	}

}
