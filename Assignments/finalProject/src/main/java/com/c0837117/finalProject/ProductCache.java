package com.c0837117.finalProject;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class ProductCache {
	private List<Product> storedProducts;
	
	public ProductCache() {
		storedProducts = new ArrayList<>();
	}
	
	public void storeProduct(Product product) {
		this.storedProducts.add(product);
	}
	
	public List<Product> getAllProducts() {
		return this.storedProducts;
	}
	
	public List<Product> getProductsByDepartment(String dept) {
		return this.storedProducts.stream().filter(pd -> pd.getDepartment().equals(dept)).toList();
	}
}
