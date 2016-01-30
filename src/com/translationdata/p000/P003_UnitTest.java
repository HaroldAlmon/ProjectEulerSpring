package com.translationdata.p000;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P003_UnitTest<x> {
	P003_Factory p003_Factory = P003_Factory.getFactory();
	
	@Test(timeout=2000)
	public void GetLargestPrimeFactorOf600851475143() {
		long result = p003_Factory.getLargestPrimeFactor().largestPrimeFactor(600851475143L);
		System.out.printf("largestFactor(600851475143) = %d%n", result);
		assertEquals("Maximum prime factor of 600851475143", 6857, result);
	}
}
