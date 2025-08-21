package com.wipro.annonymous;

import java.util.function.Function;

public class FunctionalPartdemo {

	public static void main(String[] args) {
		Function<Double, Double> getFractionalPart = num -> num - Math.floor(num);
        double input = 123.45;
        double fractionalPart = getFractionalPart.apply(input);
        System.out.println("Fractional part of " + input + " is " + fractionalPart);

	}

}
