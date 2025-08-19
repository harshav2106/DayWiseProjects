package com.wipro.basic;

public class condi_absvalue {

	public static void main(String[] args) {
		float num = 100000000f;
		if (num == 0)
		{
			System.out.println("zero");
			return;
		}
		System.out.println(num>0 ? "positive number" : "negative number");
		float abs = Math.abs(num);
		if (abs<1)
			System.out.println("small number");
		else if (abs >1_000_000)
			System.out.println("largenumber");

	}

}
