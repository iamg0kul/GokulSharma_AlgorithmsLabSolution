package com.greatlearning.foreigncurrency;

public class MinimumCurrencyGenerator {

	int leftPayAmount;

	public void minimunCurrencyGenerator(int[] currencyDenominationsArray, int payAmount) {

		leftPayAmount = payAmount;
		int[][] minimumCurrencyGeneratorArray = new int[2][currencyDenominationsArray.length];
		for (int i = currencyDenominationsArray.length - 1; i >= 0; i--) {

			int times = (int) leftPayAmount / currencyDenominationsArray[i];
			minimumCurrencyGeneratorArray[0][currencyDenominationsArray.length - i - 1] = currencyDenominationsArray[i];
			minimumCurrencyGeneratorArray[1][currencyDenominationsArray.length - i - 1] = times;
			leftPayAmount = leftPayAmount - currencyDenominationsArray[i] * times;
		}
		System.out.println();
		if (leftPayAmount == 0) {
			for (int i = 0; i < currencyDenominationsArray.length; i++)
				if (minimumCurrencyGeneratorArray[1][i] > 0)
					System.out
							.println(minimumCurrencyGeneratorArray[0][i] + ": " + minimumCurrencyGeneratorArray[1][i]);
		} else
			System.out.println("The mentioned currency cannot be converted to given denominations.");

	}

}
