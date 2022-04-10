package com.greatlearning.foreigncurrency;

import java.util.Scanner;

public class StoreCurrency {

	public int currencyDenominationsArray[];
	Scanner sc = new Scanner(System.in);

	public void createCurrencyDenominationsArray(int size) {
		currencyDenominationsArray = new int[size];
	}

	public void inputInCurrencyDenominationsArray() {

		for (int i = 0; i < currencyDenominationsArray.length; i++) {
			int value = sc.nextInt();
			// We are using while over here to avoid arithmetic exception for case of 0 as input.
			while (value < 1) {
				System.out.println("Currency cannot be " + value + " re-enter correct value.");
				value = sc.nextInt();
			}
			currencyDenominationsArray[i] = value;
		}
	}

	public void sortCurrencyDenominationsArray() {

		// Using Insertion sort as this is best for small input array size.
		int n = currencyDenominationsArray.length;
		for (int j = 1; j < n; j++) {  
            int key = currencyDenominationsArray[j];  
            int i = j-1;  
            while ( (i > -1) && ( currencyDenominationsArray [i] > key ) ) {  
            	currencyDenominationsArray [i+1] = currencyDenominationsArray [i];  
                i--;  
            }  
            currencyDenominationsArray[i+1] = key;  
		}
	}

}
