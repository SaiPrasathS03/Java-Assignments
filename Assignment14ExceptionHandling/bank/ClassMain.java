package com.zoho.bank;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) throws InsufficientBalanceException {
		Scanner sc = new Scanner(System.in);
		Account acc1 = new Account("Sai",0);
		boolean loop=true;
		while(loop) {
			System.out.println("1. Withdraw\n2. Deposit\n3. Check Balance\n4. Exit\nEnter choice: ");
			int choice = sc.nextInt();
			int amt=0;
			switch(choice) {
				case 1:
					System.out.println("Enter amount to withdraw: ");
					amt = sc.nextInt();
					acc1.withdraw(amt);
					break;
				case 2:
					System.out.println("Enter amount to deposit: ");
					amt = sc.nextInt();
					acc1.deposit(amt);
					break;
				case 3:
					acc1.checkBalance();
					break;
				case 4:
					loop = false;
			}
		}
		
	}

}
