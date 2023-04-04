package com.c0837117.finalExam;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


class q3Test {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserCache userCache;
	
	@Test
	public void listUserTest() throws Exception {
		List<User> expectedList = new ArrayList<>();
		Occupation o = new Occupation("Gym Leader", 100);
		expectedList.add(new User("Ash", 20, o));
		
		Mockito.when(userCache.getAllUsers()).thenReturn(expectedList);
		
		mockMvc.perform(get("/users"))
		.andExpect(status().isOk())
		.andExpect(view().name("users"))
		.andExpect(model().attribute("users", expectedList))
		.andExpect(model().attribute("mostpaid", this.userCache.getHighestPaidOccupation()));
	}

}
