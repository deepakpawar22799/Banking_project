package com.icici;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		System.out.println("Welcome to ICICI Bank");
		System.out.println("------------------------");

		Scanner scan=new Scanner(System.in);
		Bank b=new BankImpl(5000);

		while(true) {
			System.out.println("1:Deposit Amount\n2:Withdraw Amount");
			System.out.println("3:Check Balance\n4:Exit");
			System.out.println("Enter Choice");
			int choice = scan.nextInt();

			switch (choice) {
			case 1: 
				System.out.println("Enter Amount to Deposited:");
				int amountToDeposit = scan.nextInt();
				b.deposit(amountToDeposit); // bank.deposit(scan.nextInt());
				break;
				
			case 2: 
				System.out.println("Enter Amount to Withdrawn:");
				int amountToWithdrawn = scan.nextInt();
				b.deposit(amountToWithdrawn); // bank.Withdrawn1(scan.nextInt());
				break;
				
			case 3: 
				System.out.println("Available balance: Rs."+b.getBalance());
				break;
				
			case 4: 
				System.out.println("Thank You visit again");
				System.exit(0);
			default:
				try {
					throw new InvalidChoiceException("Invalid choice, Kindly Enter valid Choice" );
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println("==============================");
			}
		}
	}
