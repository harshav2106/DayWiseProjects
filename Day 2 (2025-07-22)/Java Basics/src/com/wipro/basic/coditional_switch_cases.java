package com.wipro.basic;

public class coditional_switch_cases {
	public static void main(String[] args) {
		char shape = 'R';
		
		switch (shape) {
		case 'R' :
			System.out.println("Rectangle");
			break;
		case 'C' :
			System.out.println("Circle");
			break;
		case 'S' :
			System.out.println("Square");
			break;
		default:
			System.out.println("entered wrong num");
		}
	}

}
