package com.translationdata.p000;
/** Strategy: Simple Mathematics. Time complexity is O(1) */
class P001_MultiplesOf3And5 {
	public int multiplesOf3And5(final int upperLimit) {
		return calculateSumBelowLimit(upperLimit, 3)
			+ calculateSumBelowLimit(upperLimit, 5)
			- calculateSumBelowLimit(upperLimit, 15);
	}

	// This is a variation of the sum(1..n) formula.
	//
	// Sum(1...kn) = k * n * (n + 1)
	//                   -----------
	//                        2
	// The formula includes n, the problem does not.
	private int calculateSumBelowLimit(final int upperLimit, final int divisor) {
		final int n = (upperLimit - 1)/divisor;
		return divisor * n * ( n + 1 ) / 2 ;
	}
}