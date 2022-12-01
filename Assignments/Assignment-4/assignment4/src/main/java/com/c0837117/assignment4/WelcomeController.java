package com.c0837117.assignment4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WelcomeController {
	
	@Autowired
	private PageCounter pageCounter;
	
	@GetMapping("/")
	public String welcome(Model model) {
		pageCounter.incrementCounter();
		model.addAttribute("pageCounter", pageCounter.getPageCount());
		return "welcome";
	}
}
