package library.books;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	String bookName;
	String author;
	int isbn;
	
	
	public Book(String bookName, String author, int isbn) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.isbn = isbn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	@Override
	public String toString(){
		return "Book [bookName=" + bookName + ", author=" + author + ", isbn=" + isbn + "]";
	}
}
