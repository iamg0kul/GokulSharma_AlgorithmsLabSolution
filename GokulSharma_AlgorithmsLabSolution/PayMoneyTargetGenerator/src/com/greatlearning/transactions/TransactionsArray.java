package com.greatlearning.transactions;

import java.util.Scanner;

public class TransactionsArray {

	public int transactionArray[];
	Scanner sc = new Scanner(System.in);

	public void createTransactionArray(int size) {
		transactionArray = new int[size];
	}

	public void inputInArray() {

		for (int i = 0; i < transactionArray.length; i++) {
			transactionArray[i] = sc.nextInt();
		}
	}

}
