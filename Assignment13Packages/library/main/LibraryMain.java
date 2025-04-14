package library.main;

import library.books.Book;
import library.books.BookOps;
import library.members.Member;
import library.members.MemberOps;
import library.transaction.Transaction;
import library.transaction.TransactionOps;

public class LibraryMain {
	public static void main(String[] args) {
		Book book1 = new Book("Wings Of Fire","Dr.A.P.J.Abdul Kalam",1);
		Book book2 = new Book("Atomic Habits","James Clear",2);
		Book book3 = new Book("The Alchemist","Paulo Coehlo",3);
		
		BookOps bo = new BookOps();
		
		bo.addBook(book1);
		bo.addBook(book2);
		bo.addBook(book3);
		
		bo.displayBooks();
		
		Member member1 = new Member("Sai","7092124759","sai@example.com");
		Member member2 = new Member("Prasath","9002124759","prasth@example.com");
		Member member3 = new Member("Prabu","8902124759","prabu@example.com");
		
		MemberOps mo = new MemberOps();
		mo.addMember(member1);
		mo.addMember(member2);
		mo.addMember(member3);
		
		mo.displayMembers();
		
		Transaction t1 = new Transaction(book1,member2,"25 Apr 2025","27 Apr 2025");
		TransactionOps to = new TransactionOps();
		to.addTransaction(t1);
		to.displayTransactions();
		
	}
}
