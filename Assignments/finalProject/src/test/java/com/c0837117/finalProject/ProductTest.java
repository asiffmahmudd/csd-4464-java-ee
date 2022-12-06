package com.c0837117.finalProject;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.*;

public class ProductTest {
	@Test
	public void ProductCreateTest() throws Exception {
		Product p = new Product("Milk", 1, 2, "Dairy");
		assertEquals(p.getName(), "Milk");
		assertEquals(p.getDepartment(), "Dairy");
	}
}
