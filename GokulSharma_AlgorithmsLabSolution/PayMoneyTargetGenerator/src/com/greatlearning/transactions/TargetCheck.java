package com.greatlearning.transactions;

public class TargetCheck {

	int targetValue;

	public int taregtCheck(int targetValue, int[] transactionArray) {
		int arraySum = 0;
		this.targetValue = targetValue;
		for (int i = 0; i < transactionArray.length; i++) {
			arraySum = arraySum + transactionArray[i];
			if (targetValue <= arraySum)
				return i + 1;
		}
		return -1;
	}

}
