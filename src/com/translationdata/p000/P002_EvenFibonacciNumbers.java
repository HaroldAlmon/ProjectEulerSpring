package com.translationdata.p000;

/** Strategy: Simple mathematics. */
public class P002_EvenFibonacciNumbers {
	int fiboSum(int upperLimit) {
		return fiboSumImpl(1, 2, 2, upperLimit);
	}

	int fiboSumImpl(final int fibo1, final int fibo2, final int total, final int upperLimit) {
		final int nextFibo = fibo1 + fibo2;
		if ( nextFibo < upperLimit) {
			if(nextFibo % 2 == 0)
				return fiboSumImpl(fibo2, nextFibo, total + nextFibo, upperLimit);
			else
				return fiboSumImpl(fibo2, nextFibo, total, upperLimit);
		}
		else
			return total;
	}
}
