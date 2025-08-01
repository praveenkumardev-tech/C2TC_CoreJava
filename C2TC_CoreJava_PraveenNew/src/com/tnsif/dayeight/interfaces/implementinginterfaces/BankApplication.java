package com.tnsif.dayeight.interfaces.implementinginterfaces;

public class BankApplication {
	public static void main(String[] args) {
		// Create a Bank instance
		Bank bank = new BankImpl();
		
		// Create an Account
		Account account = new Account(123456, "Praveen", 15000, bank);
		
		// Deposit money
		bank.deposit(account, 2000);
		System.out.println(account);
		
		// Withdraw money
		bank.withdraw(account, 10000);
		System.out.println(account);
	}
}
