package com.wipro.basic;

public class Conditional_shapes {
	public static void main(String[] args) {
		char Shape = 'R' ;
		
		if (Shape == 'R')
		{
			System.out.println("Rectangle");
		}
		else if (Shape == 'C')
		{
			System.out.println("Circle");
		}
		else if (Shape == 'S')
		{
			System.out.println("Square");
		}
		else
		{
			System.out.println("you entered wrong character");
		}
	}

}
