package com.wipro.annonymous;

public class AnnoInnerDemo {

	public static void main(String[] args) {
		
		BankOps savingAccount = new BankOps() {

			@Override
			public void deposit(double amount) {
				System.out.println(amount+ " "+"Depositing In savings Account");
				
			}
			
		};
		savingAccount.deposit(25000);
		
		BankOps currentAccount = new BankOps() {

			@Override
			public void deposit(double amount) {
				System.out.println(amount+ " "+"Depositing In current Account");
				
			}
			
		};
		currentAccount.deposit(105000);
		

	}

}
