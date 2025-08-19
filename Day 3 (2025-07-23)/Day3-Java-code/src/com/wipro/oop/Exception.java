package com.wipro.oop;

public class Exception {

	public static void main(String[] args) {
		        String fName = null;
		        
		        try {
		            String upper = fName.toUpperCase();
		            System.out.println("Uppercase: " + upper);
		        } catch (NullPointerException ex) {
		            System.out.println("Caught a NullPointerException ");
		        }

	}

}
