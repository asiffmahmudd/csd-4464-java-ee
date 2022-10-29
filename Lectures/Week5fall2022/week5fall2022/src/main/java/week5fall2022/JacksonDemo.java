package week5fall2022;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemo {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		PersonVanilla newPerson = new PersonVanilla("joe bob", 23, "big joe");
		String serializedPerson = mapper.writeValueAsString(newPerson);
		System.out.println(serializedPerson);
		//mapper.writeValue(new File("person.json"), newPerson);
	}

}
