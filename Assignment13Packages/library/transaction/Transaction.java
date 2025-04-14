package library.transaction;

import library.books.Book;
import library.members.Member;

public class Transaction {
	
	private Book book;
	private Member member;
	private String issueDate;
	private String returnDate;
	public Transaction(Book book, Member member, String issueDate, String returnDate) {
		super();
		this.book = book;
		this.member = member;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "Transaction [book=" + book + ", member=" + member + ", issueDate=" + issueDate + ", returnDate="
				+ returnDate + "]";
	}
	
	
}
