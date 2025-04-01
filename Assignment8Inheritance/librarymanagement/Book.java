package com.zoho.librarymanagement;

public class Book {
	private String title;
    private String author;
    private String isbn;
    private String publication;

    public Book(String title, String author, String isbn, String publication) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publication = publication;
    }

    public String getTitle() {
        return title;
    }

    public void showDueDate() {
        System.out.println("Due date for " + title + ": [Date]");
    }

    public void reservationStatus() {
        System.out.println("Reservation status for " + title + ": [Status]");
    }

    public void feedback(String feedbackText) {
        System.out.println("Feedback for " + title + ": " + feedbackText);
    }

    public void bookRequest() {
        System.out.println("Requesting book: " + title);
    }

    public void renewInfo() {
        System.out.println("Renewing info for " + title);
    }

	public String getAuthor() {
		return author;
	}
}
