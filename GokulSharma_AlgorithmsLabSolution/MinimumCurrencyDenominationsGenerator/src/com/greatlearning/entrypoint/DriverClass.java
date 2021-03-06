package com.greatlearning.entrypoint;

import java.util.Scanner;
import com.greatlearning.foreigncurrency.*;

public class DriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StoreCurrency obj1 = new StoreCurrency();
		MinimumCurrencyGenerator obj2 = new MinimumCurrencyGenerator();
		System.out.print("Enter the size of currency denominations: ");
		obj1.createCurrencyDenominationsArray(sc.nextInt());
		System.out.println("Enter the currency denominations value,");
		obj1.inputInCurrencyDenominationsArray();
		obj1.sortCurrencyDenominationsArray();

		System.out.print("\nEnter the amount you want to pay: ");
		obj2.minimunCurrencyGenerator(obj1.currencyDenominationsArray, sc.nextInt());

		sc.close();
	}

}
