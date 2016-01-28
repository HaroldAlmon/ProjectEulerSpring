package com.translationdata.p000;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.translationdata.JUnitTests.FastTest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


/** Strategy: Spring XML configuration. */
@Category(FastTest.class)
public class P001_UnitTest {
	String resourcePath;
	String fileName;
	final P001_Factory p001_Factory = P001_Factory.getFactory();
	
	@Test(timeout=1000)
	public void SumOfMultiplesOf3And5Below1000() {
		final int sumOfMultiples = p001_Factory.getMultiplesOf3And5().multiplesOf3And5(1_000);
		System.out.printf("P001: multiplesOf3And5(1000) = %s%n", sumOfMultiples);
		assertThat( "Incorrect sum of multiples of 3 or 5 below 1,000", sumOfMultiples, is(233168) );
	}
	
	@Test(timeout=1000)
	public void SumOfMultiplesOf3And5Below10_000() {
		final int sumOfMultiples = p001_Factory.getMultiplesOf3And5().multiplesOf3And5(10_000);
		System.out.printf("P001: multiplesOf3And5(10_000) = %s%n", sumOfMultiples);
		assertThat( "Incorrect sum of multiples of 3 or 5 below 10,000", sumOfMultiples, is(23331668) );
	}
}
