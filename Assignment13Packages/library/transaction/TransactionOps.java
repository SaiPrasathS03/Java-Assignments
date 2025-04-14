package library.transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionOps {
	List<Transaction> transactionList = new ArrayList<>();
	
	public void addTransaction(Transaction t) {
		transactionList.add(t);
	}
	
	public void displayTransactions() {
		for(Transaction t:transactionList) {
			System.out.println(t);
		}
	}

}
