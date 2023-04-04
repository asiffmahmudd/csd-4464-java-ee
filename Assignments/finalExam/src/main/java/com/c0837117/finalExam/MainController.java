package com.c0837117.finalExam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	
	@Autowired
	private UserCache userCache;
	
	@GetMapping("/users")
	public String listAllUsers(Model model) {
		model.addAttribute("users", this.userCache.getAllUsers());
		model.addAttribute("mostpaid", this.userCache.getHighestPaidOccupation());
		return "users";
	}
}
