package com.wipro.basic;

public class stringdemo {

	public static void main(String[] args) {
//		String s="madam";
//		String rev = "";
//		for(int i = 0;i<s.length();i++) 
//		{
//			rev = s.charAt(i)+rev;
//		}
//		if (s.equals(rev)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not");
//		}
		StringBuilder str = new StringBuilder("madam");
		if(str.equals(str.reverse()))
		{
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}

	}

}
