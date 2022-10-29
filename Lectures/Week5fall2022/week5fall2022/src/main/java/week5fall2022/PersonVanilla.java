package week5fall2022;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonVanilla {

	private final String name;
	
	private final Integer age;
	
	private final String nickname;

	@JsonCreator
	public PersonVanilla( 
			@JsonProperty("name") String name,
			@JsonProperty("age") Integer age,
			@JsonProperty("nickname") String nickname) {
		
		
		if ("".equals(name)) {
			throw new RuntimeException("name must not be blank!");
		}
		
		this.name = name;
		this.age = age;
		this.nickname = nickname;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getNickname() {
		return nickname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nickname == null) ? 0 : nickname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonVanilla other = (PersonVanilla) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nickname == null) {
			if (other.nickname != null)
				return false;
		} else if (!nickname.equals(other.nickname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PersonVanilla [name=" + name + ", age=" + age + ", nickname=" + nickname + "]";
	}
}
