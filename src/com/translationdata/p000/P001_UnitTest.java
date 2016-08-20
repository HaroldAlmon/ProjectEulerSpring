package com.translationdata.p000;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.translationdata.JUnitTests.FastTest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


/** Strategy: Spring XML configuration. */
@Category(FastTest.class)
@RunWith(Parameterized.class)
public class P001_UnitTest {
	String resourcePath;
	String fileName;
	int upperLimit;
	int result;
	final P001_Factory p001_Factory = P001_Factory.getFactory();
	
	@Parameters
	public static Collection<Object []> getTestData() {
		Object [][] data = {
			{1_000,	 233168},
			{10_000, 23331668 }
		};
		return Arrays.asList(data);
	}
	
	public P001_UnitTest(int upperLimit, int result) {
		this.upperLimit = upperLimit;
		this.result = result;
	}
	
	@Test(timeout=15000)
	public void SumOfMultiplesOf3And5Below1000() {
		final int sumOfMultiples = p001_Factory.getMultiplesOf3And5().multiplesOf3And5(upperLimit);
		System.out.printf("P001: multiplesOf3And5(%d) = %s%n", upperLimit, upperLimit, sumOfMultiples);
		assertThat( "Incorrect sum of multiples of 3 or 5 below 1,000", sumOfMultiples, is(result) );
	}
}
