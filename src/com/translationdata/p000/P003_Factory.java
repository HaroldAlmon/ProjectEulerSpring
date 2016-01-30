package com.translationdata.p000;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** Strategy: Spring XML configuration. */
public enum P003_Factory {
	INSTANCE;

	ApplicationContext appContext;
	
	public static P003_Factory getFactory() {
		return INSTANCE;
	}
	
	public P003_LargestPrimeFactor getLargestPrimeFactor () {
		if(appContext == null) {
			appContext = new ClassPathXmlApplicationContext("com/translationdata/resources/P003_applicationContext.xml");
		}
		return appContext.getBean("largestPrimeFactor ", P003_LargestPrimeFactor .class);
	}
}
