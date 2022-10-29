package week5fall2022;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.extern.jackson.Jacksonized;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Person {

	private final String name;
	
	private final Integer age;
	
	private final String nickname;
	
	@Jacksonized
	@Builder
	private static Person of(@JsonProperty("name") String name,
			@JsonProperty("age") Integer age,
			@JsonProperty("nickname") String nickname) {
		
		if ("".equals(name)) {
			throw new RuntimeException("name must not be blank!");
		}
		
		return new Person(name, age, nickname);
	}
}
