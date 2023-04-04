package com.c0837117.finalExam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	@Autowired
	private UserCache userCache;
	
	@GetMapping("/mostpaid")
	public String getHighestPaidOccupation() {
		return this.userCache.getHighestPaidOccupation().toString();
	}
}
