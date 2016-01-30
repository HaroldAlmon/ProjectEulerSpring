package com.translationdata.p000;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/** Strategy: Spring XML configuration. */
public enum P003_Factory {
	INSTANCE;

	ApplicationContext appContext;
	
	public static P003_Factory getFactory() {
		return INSTANCE;
	}
	
	P003_LargestPrimeFactor getLargestPrimeFactor() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(P003_AppConfig.class);
		return applicationContext.getBean("largestPrimeFactor", P003_LargestPrimeFactor.class);
	}
}
