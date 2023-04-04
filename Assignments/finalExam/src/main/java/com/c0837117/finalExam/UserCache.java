package com.c0837117.finalExam;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


@Service
public class UserCache {
	private List<User> storedUsers;
	
	public UserCache() {
		storedUsers = new ArrayList<>();
		
		Occupation o1 = new Occupation("Gym Leader", 100);
		Occupation o2 = new Occupation("Pokemon master", 300);
		Occupation o3 = new Occupation("League elite", 200);
		
		User u1 = new User("Brock", 21, o1);
		User u2 = new User("Misty", 19, o1);
		User u3 = new User("Cynthia", 24, o3);
		User u4 = new User("Bruno", 25, o3);
		User u5 = new User("Ash ketchum", 18, o2);
		User u6 = new User("Gary Oak", 20, o2);

		this.storeUser(u1);
		this.storeUser(u2);
		this.storeUser(u3);
		this.storeUser(u4);
		this.storeUser(u5);
		this.storeUser(u6);
	}
	
	public void storeUser(User user) {
		this.storedUsers.add(user);
	}
	
	public User getUserByName(String name) {
		return this.storedUsers.stream()
		.filter(user -> user.getName().equals(name))
		.findFirst()
        .get();
	}
	
	public List<User> getUserSalaryAndAge(int nSalary, int age) {
		return this.storedUsers.stream()
		.filter(user -> (user.getOccupation().getSalary() >= nSalary && user.getAge() < age))
		.collect(Collectors.toList());
	}
	
	public Occupation getHighestPaidOccupation() {
		return this.storedUsers.stream()
		.map(user -> user.getOccupation())
		.max(Comparator.comparing(Occupation::getSalary))
		.get();
	}
	
	public List<User> getAllUsers() {
		return this.storedUsers;
	}
}
