package com.wipro.test;

import com.wipro.menudemo.VowelCap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.wipro.menudemo.NonVowelLow;

public class RunnableTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList(
	            "Amit", "Jayanta", "Harsha"));

	        Runnable vowelTask = new VowelCap(names);
	        Runnable nonVowelTask = new NonVowelLow(names);

	        Thread t1 = new Thread(vowelTask);
	        Thread t2 = new Thread(nonVowelTask);

	        t1.start();
	        t2.start();
	        try {
	            t1.join();
	            t2.join();
	        } catch (InterruptedException e) {
	            System.out.println("Main thread interrupted while waiting for other threads.");
	            e.printStackTrace();
	        }

	        System.out.println("Final List: " + names);
	    }
	}