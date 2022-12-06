package com.c0837117.finalProject;

import static org.mockito.ArgumentMatchers.eq;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(ProductController.class)
public class ProductControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ProductCache productCache;
	
	@MockBean
	private ProductRepository productRepo;
	
	@MockBean
	private HitCounter count;
	
	@Test
	public void addProductTest() throws Exception {
		mockMvc.perform(get("/addproduct"))
		.andExpect(status().isOk())
		.andExpect(view().name("productform"))
		.andExpect(model().attribute("product", new Product()))
		.andExpect(model().attribute("hitcount", new HitCounter().getHitCount()));
	}
	
	@Test
	public void productPostTest() throws Exception {
		Product expectedProduct = new Product("Milk", 2, 3, "Dairy");
		mockMvc.perform(post("/addproduct").param("name", "Milk").param("price", "2.0").param("stock", "3").param("department", "Dairy"))
		.andExpect(status().isOk())
		.andExpect(view().name("productlist"))
		.andExpect(model().attribute("product", expectedProduct));
		
		Mockito.verify(productRepo).save(eq(expectedProduct));
	}
	
	@Test
	public void addPostTest_InvalidProduct() throws Exception {
		Product expectedProduct = new Product("Milk", -1, -2, "Dairy");
		
		mockMvc.perform(post("/addproduct").param("name", "Milk").param("price", "-1").param("stock", "-2").param("department", "Dairy"))
		.andExpect(status().isOk())
		.andExpect(view().name("productlist"))
		.andExpect(model().attribute("product", expectedProduct));
		
		Mockito.verifyNoInteractions(productRepo);
	}
	
	@Test
	public void listProductTest() throws Exception {
		List<Product> expectedList = new ArrayList<>();
		expectedList.add(new Product("Eggs", 2, 3, "Fruit"));
		
		Mockito.when(productRepo.findAll()).thenReturn(expectedList);
		
		mockMvc.perform(get("/products"))
		.andExpect(status().isOk())
		.andExpect(view().name("productlist"))
		.andExpect(model().attribute("products", expectedList));
	}
}
