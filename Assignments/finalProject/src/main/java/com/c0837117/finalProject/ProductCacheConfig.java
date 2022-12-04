package com.c0837117.finalProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductCacheConfig {
	
	@Bean
	public ProductCache getProductCache() {
		return new ProductCache();
	}
}
