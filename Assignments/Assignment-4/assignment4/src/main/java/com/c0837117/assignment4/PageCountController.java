package com.c0837117.assignment4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageCountController {
	
	@Autowired
	private PageCounter pageCounter;
	
	@GetMapping("/currentcount")
	public String currentCount() {
		return String.valueOf(pageCounter.getPageCount());
	}
}
