package com.wipro.oop.test;

import com.wipro.oop.Citi;
import com.wipro.oop.HDFC;

public class BankTest {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.deposit(15000, "HDFC1234");
		h.withdraw(25000, "HDFC1234");
		Citi c = new Citi();
		c.deposit(35000, "Citi1234");
		c.withdraw(45000, "Citi1234");
		
		

	}

}
