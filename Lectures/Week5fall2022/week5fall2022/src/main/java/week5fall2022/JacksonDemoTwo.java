package week5fall2022;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemoTwo {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Person newPerson = mapper.readValue(new File("person.json"), Person.class);
		System.out.println(newPerson.toString());
	}

}
