package library.books;

import java.util.ArrayList;
import java.util.List;

public class BookOps {
	List<Book> bookList = new ArrayList<>();
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public void displayBooks() {
		for(Book book:bookList) {
			System.out.println(book);
		}
	}

}
