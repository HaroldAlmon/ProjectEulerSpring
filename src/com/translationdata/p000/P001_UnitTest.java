package com.translationdata.p000;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.translationdata.JUnitTests.FastTest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;


/** Strategy: Spring XML configuration. */
@Category(FastTest.class)
public class P001_UnitTest {
	public P001_MultiplesOf3And5 getMultiplesOf3And5() {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/translationdata/resources/P001_applicationContext.xml");
		return appContext.getBean("multiplesOf3And5", P001_MultiplesOf3And5.class);
	}

	@Test(timeout=1000)
	public void SumOfMultiplesOf3And5Below1000() {
		final int sumOfMultiples = getMultiplesOf3And5().multiplesOf3And5(1_000);
		System.out.printf("multiplesOf3And5(1000) = %s%n", sumOfMultiples);
		assertThat( "Incorrect sum of multiples of 3 or 5 below 1,000", sumOfMultiples, is(233168) );
	}
	
	@Test(timeout=1000)
	public void SumOfMultiplesOf3And5Below10_000() {
		final int sumOfMultiples = getMultiplesOf3And5().multiplesOf3And5(10_000);
		System.out.printf("P001: multiplesOf3And5(10_000) = %s%n", sumOfMultiples);
		assertThat( "Incorrect sum of multiples of 3 or 5 below 10,000", sumOfMultiples, is(23331668) );
	}
}
