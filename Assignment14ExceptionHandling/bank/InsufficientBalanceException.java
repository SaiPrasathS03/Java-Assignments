package com.zoho.bank;

public class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(){
		super("Insufficient Balance");
	}
}
