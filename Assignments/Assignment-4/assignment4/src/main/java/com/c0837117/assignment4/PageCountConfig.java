package com.c0837117.assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PageCountConfig {
	
	@Bean
	public PageCounter getPageCounter() {
		return new PageCounter();
	}
}
