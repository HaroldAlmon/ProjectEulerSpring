package com.translationdata.p000;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.translationdata.JUnitTests.FastTest;

/** Strategy: Simple mathematics. */
@Category(FastTest.class)
public class P002_UnitTest {
	final P002_Factory p002_Factory = P002_Factory.getFactory();
	
	@Test(timeout = 1000)
	public void SumOfEvenTermsLessThanFourMillion() {
		int result = p002_Factory.getEvenFibonacciNumbers().fiboSum(4_000_000);
		System.out.printf("P001: fiboSum(4_000_000) = %s%n", result);
		assertEquals("Incorrect sum of even Fibo numbers that do not exceed 4 million",	4613732, result);
	}
}
