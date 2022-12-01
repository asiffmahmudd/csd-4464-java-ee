package ca.lambton.week10fall2022;

import java.util.ArrayList;
import java.util.List;

public class UserCache {

	private List<User> storedUsers;
	
	public UserCache() {
		storedUsers = new ArrayList<>();
	}
	
	public void storeUser(User user) {
		this.storedUsers.add(user);
	}
	
	public List<User> getAllUsers() {
		return this.storedUsers;
	}
}
