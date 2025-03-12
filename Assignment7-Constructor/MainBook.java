package com.zoho;

import java.util.Scanner;

public class MainBook {
	public static void main(String[] args) {
		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		while(loop) {
			System.out.println("1. Add Books\n2. Display all books\n3. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter book title: ");
				String title = sc.nextLine();
				
				System.out.println("Enter book author: ");
				String author = sc.nextLine();
				System.out.println("Enter book published year: ");
				int year = sc.nextInt();
//				sc.nextLine();
				Book book = new Book(title,author,year);
				Book.addBook(book);
				break;
			case 2:
				Book.displayAll();
				break;
			case 3:
				loop = false;
			}	
		}
	}
}
