package com.translationdata.p000;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class P003_AppConfig {
	@Bean(name = "largestPrimeFactor")
	P003_LargestPrimeFactor getLargestPrimeFactor() {
		return new P003_LargestPrimeFactor();
	}
}
