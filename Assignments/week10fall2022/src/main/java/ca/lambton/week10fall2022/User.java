package ca.lambton.week10fall2022;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

	@Email
	@NotNull
	private String email;
	
	@NotNull
	@Size(min = 2, max = 40)
	private String name;
	
	private Integer age;
}
