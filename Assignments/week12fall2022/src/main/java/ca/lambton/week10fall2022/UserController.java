package ca.lambton.week10fall2022;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@Autowired
	private UserCache userCache;
	
	@Autowired
	private UserRepository userRepo;

	@GetMapping("/createuser")
	public String userForm(Model model) {
		model.addAttribute("user", new User());
		return "userform";
	}
	
	@PostMapping("/createuser")
	public String createUser(@Valid User toSave, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "userform";
		} else {
			this.userRepo.save(toSave);
			return "saved";
		}
	}
	
	
	@GetMapping("/allusers")
	public String listAllUsers(Model model) {
		model.addAttribute("users", this.userRepo.findAll());
		return "listusers";
	}
}
