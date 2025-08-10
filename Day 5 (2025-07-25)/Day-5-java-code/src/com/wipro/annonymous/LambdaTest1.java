package com.wipro.annonymous;

public class LambdaTest1 {

	public static void main(String[] args) {
		Multiply m = (a,b)->{return a*b;};
		
		int x = m.multiply(2, 3);
		System.out.println(x);

	}

}
