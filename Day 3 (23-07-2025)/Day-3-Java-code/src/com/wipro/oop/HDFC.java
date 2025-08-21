package com.wipro.oop;

public class HDFC implements BankOps {

	@Override
	public void deposit(double amount, String accNumber) {
		System.out.println(amount+" "+accNumber);

	}

	@Override
	public void withdraw(double amount, String accNumber) {
		System.out.println(amount+" "+accNumber);
	}

}
