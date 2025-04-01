package com.zoho.librarymanagement;

public class Account{
	private int noBorrowedBooks;
    private int noReservedBooks;
    private int noReturnedBooks;
    private int noLostBooks;
    private double fineAmount;

    public Account() {
        this.noBorrowedBooks = 0;
        this.noReservedBooks = 0;
        this.noReturnedBooks = 0;
        this.noLostBooks = 0;
        this.fineAmount = 0.0;
    }

    public void calculateFine() {
        this.fineAmount = this.noLostBooks * 10.0; 
        System.out.println("Fine calculated: $" + this.fineAmount);
    }

    public void displayAccountInfo() {
        System.out.println("Account Information:");
        System.out.println("Borrowed Books: " + noBorrowedBooks);
        System.out.println("Reserved Books: " + noReservedBooks);
        System.out.println("Returned Books: " + noReturnedBooks);
        System.out.println("Lost Books: " + noLostBooks);
        System.out.println("Fine Amount: $" + fineAmount);
    }
}
