package com.translationdata.p000;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.translationdata.JUnitTests.FastTest;

/** Strategy: Simple mathematics. */
@Category(FastTest.class)
@RunWith(Parameterized.class)
public class P002_UnitTest {
	P002_EvenFibonacciNumbers getEvenFibonacciNumbers() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/translationdata/resources/P002_applicationContext.xml");
		return applicationContext.getBean("evenFibonacciNumbers", P002_EvenFibonacciNumbers.class);
	}


	@Test(timeout = 500)
	public void SumOfEvenTermsLessThanFourMillion() {
		int result = getEvenFibonacciNumbers().fiboSum(4_000_000);
		System.out.printf("P001: fiboSum(4_000_000) = %s%n", result);
		assertEquals("Incorrect sum of even Fibo numbers that do not exceed 4 million",	4613732, result);
	}
}
