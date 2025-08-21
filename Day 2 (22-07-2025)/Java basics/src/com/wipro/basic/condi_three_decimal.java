package com.wipro.basic;

public class condi_three_decimal {

	public static void main(String[] args) {
		float num1 = 24.59647f;
		float num2 = 24.59764f;
		
		int n1 = Math.round(num1 * 1000);
		int n2 = Math.round(num2 * 1000);
		if (n1 == n2)
		{
			System.out.println("they are same up to three decimal num");
		}
		else
		{
			System.out.println("They are different");
		}
	}

}
