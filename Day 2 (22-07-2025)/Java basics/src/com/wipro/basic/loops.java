package com.wipro.basic;

public class loops {

	public static void main(String[] args) {
		//for(int i=0;i<=10;i=i+2)
		//{
		//	System.out.println(i);
		//}
//		int sum = 0;
//        int i = 2; // Start from 2, the first even number
//        do {
//            sum += i;
//            i += 2; // Move to the next even number
//        } while(i <= 100);
//
//        System.out.println("Summation of all even numbers between 1 to 100: " + sum);
//		int sum = 0;
//        int i = 2; // Start from the first even number
//
//        while(i <= 100) {
//            sum += i;
//            i += 2; // Move to the next even number
//        }
//
//        System.out.println("Summation of all even numbers between 1 to 100: " + sum);
		int sum = 0;
        for(int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("Summation of all even numbers between 1 to 100: " + sum);
	}

}
