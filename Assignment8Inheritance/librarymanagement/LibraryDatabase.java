package com.zoho.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {
	private List<Book> listOfBooks;

    public LibraryDatabase() {
        this.listOfBooks = new ArrayList<>();
    }

    public void add(Book book) {
        listOfBooks.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void delete(Book book) {
        listOfBooks.remove(book);
        System.out.println("Deleted book: " + book.getTitle());
    }

    public void update(Book oldBook, Book newBook) {
        int index = listOfBooks.indexOf(oldBook);
        if (index != -1) {
            listOfBooks.set(index, newBook);
            System.out.println("Updated book: " + oldBook.getTitle());
        } else {
            System.out.println("Book not found.");
        }
    }

    public void display() {
        System.out.println("List of books in the library:");
        for (Book book : listOfBooks) {
            System.out.println("- " + book.getTitle());
        }
    }

    public void search(String searchString) {
        System.out.println("Searching for books containing: " + searchString);
        for (Book book : listOfBooks) {
            if (book.getTitle().contains(searchString) || book.getAuthor().contains(searchString)) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
