package com.zoho.bank;

public class Account {
	private int AccountNo;
	private String name;
	private int balance;
	private static int number=1;
	public Account(String name, int balance) {
		AccountNo = number++;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int amount) {
		balance+=amount;
		System.out.println("Amount Deposited");
	}
	
	public void withdraw(int amount) throws InsufficientBalanceException {
		if(amount<=0) System.out.println("Enter valid amount");
		else if(balance-amount>=0) {
			balance-=amount;
			System.out.println("Amount withdrawn: "+amount);
			this.checkBalance();
		}
		else throw new InsufficientBalanceException();
	}
	public void checkBalance() {
		System.out.println("Balance: "+balance);
	}

}
