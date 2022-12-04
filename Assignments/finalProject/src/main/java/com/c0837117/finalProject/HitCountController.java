package com.c0837117.finalProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HitCountController {
	
	@Autowired
	private HitCounter hitCounter;
	
	@GetMapping("/currentcount")
	public String currentCount() {
		return String.valueOf(hitCounter.getHitCount());
	}
}
