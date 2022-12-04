package ca.lambton.week10fall2022;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.eq;

@WebMvcTest(UserController.class)
public class UserControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private UserCache userCache;
	
	@MockBean
	private UserRepository userRepo;
	
	@Test
	public void createuserTest() throws Exception {
		mockMvc.perform(get("/createuser"))
		//.andDo(print());
		.andExpect(status().isOk())
		.andExpect(view().name("userform"))
		.andExpect(model().attribute("user", new User()));
	}
	
	@Test
	public void createPostTest() throws Exception {
		User expectedUser = new User(null, "joe@bob.com", "joe boe", 22);
		mockMvc.perform(post("/createuser").param("name", "joe boe").param("email", "joe@bob.com").param("age", "22"))
		.andExpect(status().isOk())
		.andExpect(view().name("saved"))
		.andExpect(model().attribute("user", expectedUser));
		
		Mockito.verify(userRepo).save(eq(expectedUser));
	}
	
	@Test
	public void createPostTest_InvalidUser() throws Exception {
		User expectedUser = new User(null, "joe", "joe boe", 22);
		
		mockMvc.perform(post("/createuser").param("name", "joe boe").param("email", "joe").param("age", "22"))
		.andExpect(status().isOk())
		.andExpect(view().name("userform"))
		.andExpect(model().attribute("user", expectedUser));
		
		Mockito.verifyNoInteractions(userRepo);
	}
	
	@Test
	public void listUserTest() throws Exception {
		List<User> expectedList = new ArrayList<>();
		expectedList.add(new User(null, "joe@bob.com", "joe boe", 22));
		
		Mockito.when(userRepo.findAll()).thenReturn(expectedList);
		
		mockMvc.perform(get("/allusers"))
		.andExpect(status().isOk())
		.andExpect(view().name("listusers"))
		.andExpect(model().attribute("users", expectedList));
	}
}
