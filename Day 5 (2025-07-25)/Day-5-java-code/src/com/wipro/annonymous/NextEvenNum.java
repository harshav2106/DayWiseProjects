package com.wipro.annonymous;

import java.util.function.Consumer;

public class NextEvenNum {
	public static void main(String[] args) {

		Consumer<Integer> nextEven = num -> {
            int nextEvenNum = (num % 2 == 0) ? num + 2 : num + 1;
            System.out.println("Next even number: " + nextEvenNum);
        };

        nextEven.accept(6);
	}

}
		



