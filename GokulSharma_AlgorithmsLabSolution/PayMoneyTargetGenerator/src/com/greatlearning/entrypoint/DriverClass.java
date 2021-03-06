package com.greatlearning.entrypoint;

import java.util.Scanner;
import com.greatlearning.transactions.*;

public class DriverClass {

	public static void main(String[] args) {
		int numberOfTargets;
		Scanner sc = new Scanner(System.in);
		TransactionsArray obj1 = new TransactionsArray();
		TargetCheck obj2 = new TargetCheck();
		System.out.print("Enter the size of transaction array: ");
		obj1.createTransactionArray(sc.nextInt());
		System.out.println("Enter the values of array: ");
		obj1.inputInArray();
		System.out.print("\nEnter the total no of targets that needs to be achieved: ");
		numberOfTargets = sc.nextInt();
		for (int i = 0; i < numberOfTargets; i++) {

			System.out.print("Enter the value of target: ");
			int position = obj2.taregtCheck(sc.nextInt(), obj1.transactionArray);
			if (position == -1)
				System.out.println("\nGiven target is not achieved.");
			else if (position == 1)
				System.out.println("\nTarget achieved after 1 transaction.");
			else
				System.out.println("\nTarget achieved after " + position + " transactions.");
		}

		sc.close();
	}

}
