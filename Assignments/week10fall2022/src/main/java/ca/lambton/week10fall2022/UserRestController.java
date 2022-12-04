package ca.lambton.week10fall2022;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	@Autowired
	private UserCache userCache;
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/usercount")
	public Long listAllUsers() {
		return userRepo.count();
	}
	
	@GetMapping("/findbyname")
	public User findByName(@RequestParam String name) {
		return this.userRepo.findByName(name);
	}
}
