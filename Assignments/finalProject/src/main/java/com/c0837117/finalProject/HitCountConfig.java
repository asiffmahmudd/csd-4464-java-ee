package com.c0837117.finalProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HitCountConfig {
	
	@Bean
	public HitCounter getHitCounter() {
		return new HitCounter();
	}
}
