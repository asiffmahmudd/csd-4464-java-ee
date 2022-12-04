package com.c0837117.finalProject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("products")
public class Product {
	
	@NotNull
	@Size(min = 1, max = 100)
	private String name;
	
	@DecimalMin(value = "0.1")
	@NotNull
	private double price;
	
	@NotNull
	@Pattern(regexp="^[1-9]+[0-9]*$")
	private int stock;

	@NotNull
	private String department;
}
