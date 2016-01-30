package com.translationdata.p000;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class P003_UnitTest {
	P003_LargestPrimeFactor getLargestPrimeFactor() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(P003_AppConfig.class);
		return applicationContext.getBean("largestPrimeFactor", P003_LargestPrimeFactor.class);
	}
	
	@Test(timeout=2000)
	public void GetLargestPrimeFactorOf600851475143() {
		long result = getLargestPrimeFactor().largestPrimeFactor(600851475143L);
		System.out.printf("largestFactor(600851475143) = %d%n", result);
		assertEquals("Maximum prime factor of 600851475143", 6857, result);
	}
}
