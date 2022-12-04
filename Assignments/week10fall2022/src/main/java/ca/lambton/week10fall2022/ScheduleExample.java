package ca.lambton.week10fall2022;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleExample {

	@Autowired
	private UserCache userCache;
	
	//@Scheduled(fixedDelay=3000)
	public void myScheduledMethod() {
		System.out.println("System current has " + userCache.getAllUsers().size() + " users");
		System.out.println(userCache.getAllUsers());
	}
}
