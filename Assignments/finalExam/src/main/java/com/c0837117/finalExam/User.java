package com.c0837117.finalExam;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	@Size(min = 2, max = 40)
	private String name;
	@Min(2)
	private int age;
	Occupation occupation;
}
