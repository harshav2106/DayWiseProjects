package com.wipro.oop;

public class Throwdemo {

	public static void main(String[] args) {
		try {
		System.out.println(staticaddString("harsha",""));
		}catch(RuntimeException ex)
		{
			System.out.println(ex.getMessage());
		}

	}
	static String staticaddString(String string1,String string2) throws RuntimeException
	{
		if (string1.isBlank()||string2.isBlank())
		{
		throw new RuntimeException("Empty string");	
		}
	return string1+" "+string2;
	}
	
	
	
}
