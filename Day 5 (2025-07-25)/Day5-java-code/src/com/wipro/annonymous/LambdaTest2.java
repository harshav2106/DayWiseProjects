package com.wipro.annonymous;

public class LambdaTest2 {

	public static void main(String[] args) {
		Greet greet = ()->{System.out.println("HelloLambda");};
		greet.sayHello();
		

	}

}
