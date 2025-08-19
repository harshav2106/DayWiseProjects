package com.wipro.basic;

public class For_each {

	public static void main(String[] args) {
//		int[] arr = {21,17,14,15,19,4,5};
//		for(int a :arr)
//		{
//			System.out.println(a);
//		}
		enum Month  {
				JAN,
				FEB,
				MAR,
				APR,
				MAY,
				JUN,
				JUL,
				AUG,
				SEP,
				OCT,
				NOV,
				DEC
		}
		for(Month m:Month.values())
		{
			System.out.println(m);
		}
	}

}
