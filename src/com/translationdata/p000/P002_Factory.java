package com.translationdata.p000;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** Strategy: Spring XML configuration. */
public enum P002_Factory {
	INSTANCE;

	ApplicationContext appContext;
	
	public static P002_Factory getFactory() {
		return INSTANCE;
	}
	
	public P002_EvenFibonacciNumbers getEvenFibonacciNumbers () {
		if(appContext == null) {
			appContext = new ClassPathXmlApplicationContext("com/translationdata/resources/P002_applicationContext.xml");
		}
		return appContext.getBean("evenFibonacciNumbers", P002_EvenFibonacciNumbers .class);
	}
}
