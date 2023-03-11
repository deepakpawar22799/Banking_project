package com.icici;

public class BankImpl implements Bank {

	int balance;

	public BankImpl(int balance) {
		this.balance=balance;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance = balance + amount; // balance + = amount 
		System.out.println("Amount Deposited Successfully!");

	}

	@Override
	public void withdraw(int amount) {
		if(amount <= balance) {
		System.out.println("Withdrawing Rs."+amount);
		balance -= amount; //balance = balance - amount
		System.out.println("Amount withdrawn Successfully!");

	}
		else {
			try {
				throw new InsufficientBalanceException("Insufficient balance!");
				
			}
			catch(Exception e){
				System.out.println("e.getMessage()");
				
			}
			
		}
	}
	@Override
	public int getBalance() {
		return balance;
	}

}
