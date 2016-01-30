package com.translationdata.p000;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** Strategy: Spring XML configuration. */
public enum P001_Factory {
	INSTANCE;

	ApplicationContext appContext;
	
	public static P001_Factory getFactory() {
		return INSTANCE;
	}
	
	public P001_MultiplesOf3And5 getMultiplesOf3And5() {
		if(appContext == null) {
			appContext = new ClassPathXmlApplicationContext("com/translationdata/resources/P001_applicationContext.xml");
		}
		return appContext.getBean("multiplesOf3And5", P001_MultiplesOf3And5.class);
	}
}
