package com.zoho;

public class Book {
	
	private static int isbn=1;
	private String title;
	private String author;
	private int publishedYear;
	
	
	
	public Book(String title, String author,int publishedYear) {
		super();
		this.isbn = isbn++;
		this.title = title;
		this.author = author;
		this.publishedYear = publishedYear;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public String toString() {
		return "Book [Id= " + isbn + "title= " + title + ", author= " + author + ", publishedYear= " + publishedYear + "]";
	}
	
	
}
